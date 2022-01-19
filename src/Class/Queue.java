/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import GUI.Locket;

public class Queue {
    public LinkQueue front;
    public LinkQueue rear;
    public Locket loket;
    private int nItems;
    
    public Queue() {
        front  = null;
        rear = null;
        nItems = 1;
    }
    
    public boolean isEmpty() {
        return (front == null);
    }

    public void insert(String value) {
        LinkQueue temp = new LinkQueue(value);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        nItems++;
    }

    public LinkQueue remove() {
        if (front == null) {
            return null;
        }
        
        LinkQueue temp = front;
        front = front.next;
        
        if (front == null)
            rear = null;
        
        nItems--;
        return temp;
    }
    
    public String peek(){
        return front.nomor;
    }
    
    public int size() {
        if (nItems <= 0) {
            nItems = 1;
        }
        return nItems;
    }

    public void displayQueue() {
        System.out.println("Queue (front-->rear) :");

        LinkQueue current = front;
        while(current != null) {
            System.out.println(current.nomor);
            loket.txtAntrian.append(" Nomor "+current.nomor +"\n");
            current = current.next;
        }
        System.out.println("");
    }
}
