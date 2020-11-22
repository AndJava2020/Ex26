package com.company;

public class Main {

    public static void main(String[] args) {
        Queue first=new Queue(10);
        first.add(2);
        first.add(3);
        first.add(4);

        System.out.println(first);
        System.out.println(first.pull());
        System.out.println(first.pull());
        System.out.println();

        ArrayQueueModule.ArrayQueueModule(10);
        System.out.println(ArrayQueueModule.class);
        ArrayQueueModule.add(2);
        ArrayQueueModule.add(3);
        ArrayQueueModule.add(4);
        System.out.println(ArrayQueueModule.pull());
        System.out.println(ArrayQueueModule.pull());
        System.out.println();

        ArrayQueueADT a=new ArrayQueueADT();
        System.out.println(a.getClass());
        ArrayQueueADT.ArrayQueueADT(a,10);
        a.add(a,2);
        a.add(a,3);
        a.add(a,4);
        System.out.println(a.pull(a));
        System.out.println(a.pull(a));
        System.out.println();

        QueueList q=new QueueList(5);
        q.add(3);
        System.out.println(q);
        q.add(5);
        System.out.println(q);
        q.add(6);
        System.out.println(q);
        System.out.println(q.pull());
        System.out.println(q.pull());
        System.out.println(q.pull());
        System.out.println(q);




    }
}
