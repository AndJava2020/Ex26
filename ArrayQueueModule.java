package com.company;

import java.util.Random;

public abstract class ArrayQueueModule {
    private static int [] queue_mass;
    private static  int elements=0;
    private static  int begin;
    private static int end;

    static void ArrayQueueModule(int value){
        queue_mass=new int[value];
        begin=-1;
        end=-1;
    }
    public  static  void generate(){
        Random rand= new Random();
        while(!isFull()){
            add(Math.abs(rand.nextInt())%1000);
        }
    }
    public static  void add(int element){
        if(!isFull()) {
            end = (end + 1) % queue_mass.length;
            queue_mass[end % queue_mass.length] = element;
        }
    }
    public static  int pull(){
        elements--;
        begin=(begin+1)%queue_mass.length;
        return queue_mass[begin];
    }
    public static  void del(){
        elements--;
        begin=(begin+1)%queue_mass.length;
    }
    public static  boolean isFull(){
        if(elements!=queue_mass.length) return false;
        else return true;
    }
    public static  boolean isEmpty(){
        if(elements==0) return true;
        else return false;
    }
    public  static boolean deleteQueue(){
        queue_mass=new int[queue_mass.length];
        begin=-1;
        end=-1;
        return true;
    }
    public static  int valueElements(){
        return elements;
    }
}
