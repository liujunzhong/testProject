package com.ncu.testThread;

import java.util.concurrent.*;

public class TestForkJoin extends RecursiveTask<Integer> {
    private static final int THRESH_HOLD = 2;
    int start;
    int end;

    public TestForkJoin(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        boolean flag = end - start <=THRESH_HOLD;
        int sum = 0;
        if (flag){
            for (int i=start;i<=end;i++){
                sum += i;
            }
        }else {
            int mid = (end + start)/2;
            RecursiveTask task1 = new TestForkJoin(start,mid);
            RecursiveTask task2 = new TestForkJoin(mid + 1,end);
            task1.fork();
            task2.fork();

            int s = (int) task1.join();
            int s2 = (int) task2.join();
            sum = s + s2;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestForkJoin task = new TestForkJoin(1, 100);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> result = forkJoinPool.submit(task);
        Integer integer = result.get();
        System.out.println("result: " + integer);
    }
}
class TestAction extends RecursiveAction{


    public TestAction() {
    }

    @Override
    protected void compute() {

    }
}
