package com.company;

import java.util.Random;

public class ArrayQueueADT {
    private  int [] queue_mass;
    private int elements=0;
    private int begin;
    private int end;

    public static void ArrayQueueADT (ArrayQueueADT q, int value){
        q.queue_mass =new int[value];
        q.begin=-1;
        q.end=-1;
    }
    public void generate(ArrayQueueADT q){
        Random rand= new Random();
        while(!isFull(q)){
            q.add(q,Math.abs(rand.nextInt())%1000);
        }
    }
    public void add(ArrayQueueADT q,int element){
        if(!isFull(q)) {
            q.end = (q.end + 1) % q.queue_mass.length;
            q.queue_mass[q.end % q.queue_mass.length] = element;
        }
    }
    public int pull(ArrayQueueADT q){
        q.elements--;
        q.begin=(q.begin+1)%q.queue_mass.length;
        return q.queue_mass[begin];
    }
    public  void del(ArrayQueueADT q){
        q.elements--;
        q.begin=(q.begin+1)%q.queue_mass.length;
    }
    public  boolean isFull(ArrayQueueADT q){
        if(q.elements!=q.queue_mass.length) return false;
        else return true;
    }
    public  boolean isEmpty(ArrayQueueADT q){
        if(q.elements==0) return true;
        else return false;
    }
    public  int valueElements(ArrayQueueADT q){
        return q.elements;
    }
}