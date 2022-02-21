package Assignments.Assignment10;

import org.w3c.dom.Node;

public class SList <T>{
    Node <T> head;
    SList(){
        this.head = null;
    }
    public SListIterator iterator()
    {
        return new SListIterator(head);
    }

}
