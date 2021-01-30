package edu.escuelaing.arem.linkedList;

import java.util.List;

/***
 * Implementacion linked list
 * @author ceseg
 */
public class LinkedList {
    private int size;
    private Node head;

    public LinkedList(){
        size = 0;
        head = new Node(null);
    }

    /**
     * Metodo encargado de adicionar un elemento al final de la linkedlist
     *
     * @param data
     */
    public void append(Double data){
        if (size==0) {
            head = new Node(data);
        }
        else{
            Node last = new Node(data);
            Node current = head;
            while(current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(last);
        }
        size++;
    }

    /**
     * Metodo encargado de obtener un elemento por su indice en la linked list
     *
     * @param index
     * @return
     */
    public Double get(int index){
        if (index < 0 ){
            return null;
        }
        if (head != null){
            int count = 0;
            Node current = head;
            while(count < index){
                if(current.getNext() == null){
                    return null;
                }
                current = current.getNext();
                count ++;
            }
            return current.getData();
        }
        return null;
    }
    public String toString() {
        String output = "";
        if (head != null) {
            Node current = head;
            output += "[";
            boolean first = true;
            while (current != null) {
                if(first){
                    output += current.getData().toString();
                    first = false;
                }
                else{output += ", " + current.getData().toString() ;}
                current = current.getNext();
            }
            output += "]";

        }
        return output;
    }
    public int getSize(){return size;}
}
