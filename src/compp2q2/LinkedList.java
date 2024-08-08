/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compp2q2;

/**
 *
 * @author ardakonak
 */
public class LinkedList<Item> {
    private class Node<Item>{
        Item item;
        Node next;
        
        public Node(Item item){
            this.item = item;
            next = null;
        }
        
        @Override
        public String toString(){
            while(next!= null){
            return item +" " +  next + " " ; 
            }
            return "" + item;
        }
           
    }
    
    Node<Item> first, last;
    int size;
    
    public LinkedList(){
        first = last = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean hasItem(Item item){
        Node searchNode = first;
        while(searchNode != null){
            if(searchNode.item == item)
                return true;
            searchNode = searchNode.next;
        }
        return false;
    }
    
    public void insertFirst(Item item){
        Node newNode = new Node(item);
        if(isEmpty()){
            first = last = newNode;
        }else{
            newNode.next = first;
            first = newNode;
        }
        size++;
    }
    
    public void insertLast(Item item){
        Node newNode = new Node(item);
        if(isEmpty()){
            first = last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    
    @Override
    public String toString(){
        return  "These are the found values in files and the locations --> " + first ; 
    }
}