package com.liang.juc.util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: Test2
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/4/21 10:50
 * @Version jdk11
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        extracted(executorService);

//        extracted1();


    }

    private static void extracted1() {
        Supplier<String> supplier = ()->{
            return "liang";
        };
        System.out.println(supplier.get());
        Consumer<Integer> consumer = (integer) ->{
            System.out.println(integer);
        };
        consumer.accept(2);
        Function<Integer,Integer> function =(integer -> {
            integer++;
            return  integer;
        });
        Integer apply = function.apply(2);
        System.out.println(apply);
    }

    private static void extracted(ExecutorService executorService) throws InterruptedException, ExecutionException {
        Future<String> liang = executorService.submit(() -> {
            Thread.sleep(3000);
            System.out.println("liang黄");
            return "liang";
        });
           executorService.execute(() -> {
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("liang黄");

        });
        executorService.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("liang黄");

        });
        executorService.shutdown();
        System.out.println(liang.get());
        executorService.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("liang黄");

        });

    }
}
