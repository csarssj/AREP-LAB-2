package edu.escuelaing.arem.linkedList;
/**
 * Implementacion clase nodo
 * @author ceseg
 */
public class Node {
    private Double data;
    private Node next;

    /**
     *
     * @param _data
     */
    public Node(Double _data){
        data = _data;
        next= null;

    }

    /**
     *
     * @param _data
     * @param _next
     */
    public Node(Double _data, Node _next){
        data = _data;
        next= _next;
    }


    public Double getData() {
        return data;
    }

    public void setData(Double _data) {
        data = _data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node _next) {
        next = _next;
    }
}
