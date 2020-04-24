package com.ncu.netty.time;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Author ljz
 * @Date 2019/12/28 14:13
 * @Version 1.0
 **/
public class TimeServer {
    int port;

    public TimeServer(int port) {
        this.port = port;
    }

    public void run() throws InterruptedException {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

      try {
          ServerBootstrap b = new ServerBootstrap();
          b.group(bossGroup,workerGroup)
                  .channel(NioServerSocketChannel.class)
                  .childHandler(new ChannelInitializer<SocketChannel>() {
                      @Override
                      protected void initChannel(SocketChannel ch) throws Exception {
                          ch.pipeline().addLast(new TimeServerHandler());
                      }
                  })
                  .option(ChannelOption.SO_BACKLOG,128)
                  .childOption(ChannelOption.SO_KEEPALIVE,true);
          ChannelFuture f = b.bind(port).sync();
          f.channel().closeFuture().sync();
      }finally {
          workerGroup.shutdownGracefully();
          bossGroup.shutdownGracefully();
      }
    }
    public static void main(String[] args) throws InterruptedException {
        int port = 8080;
        if(args.length > 0){
            port = Integer.parseInt(args[0]);
        }
        new TimeServer(port).run();
    }
}
