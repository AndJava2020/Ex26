package com.company;

public class QueueList {
    private ListElement head;
    private ListElement tail;
    private int elements;
    private int size;

    QueueList(int value){
        elements=0;
        size=value;
    }
    void add(int element)
    {
        if(elements+1!=size){

            ListElement a = new ListElement();
            a.element=element;
            if(head == null) {
                elements++;
                head = a;
                head.next=tail;
                tail = a;
            } else {
                elements++;
                tail.next=a;
                tail=tail.next;
            }
        }
    }
    public boolean isFull(){
        if(elements!=size) return false;
        else return true;
    }
    public boolean isEmpty(){
        if(elements==0) return true;
        else return false;
    }
    void del() {
        if(head == null)
            return;
        pull();
    }
    public int pull(){
        elements--;
        ListElement tmp=head;
        head=head.next;
        return tmp.element;
    }
    @Override
    public String toString() {
        return "Queue_list{" +
                "head=" + head +
                ", tail=" + tail +
                ", elements=" + elements +
                ", size=" + size +
                '}';
    }
}
