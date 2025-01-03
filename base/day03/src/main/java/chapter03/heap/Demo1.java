package chapter03.heap;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;

/**
 * 堆内存的使用和回收
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        //JMX打印堆内存
        MemoryUsage heapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        System.out.println(heapMemoryUsage.getMax());


        ArrayList<Object> objects = new ArrayList<Object>();
        while (true){
//            System.in.read();
            objects.add(new byte[1024 * 1024 * 100]);
            Thread.sleep(1500);
        }


    }
}
