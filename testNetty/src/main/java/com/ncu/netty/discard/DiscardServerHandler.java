package com.ncu.netty.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @Author ljz
 * @Date 2019/12/28 10:58
 * @Version 1.0
 **/
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        ((ByteBuf)msg).release();

//        ByteBuf in = (ByteBuf)msg;
//        try {
//            while (in.isReadable()){
//                System.out.println((char) in.readByte());
//                System.out.flush();
//            }
//        }finally {
//            ReferenceCountUtil.release(msg);
//        }
        // 将收到的消息返回到客户端
//        ctx.writeAndFlush(msg);
        ctx.write(msg);
        ctx.flush();

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
