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
public class SeparateChainHash<Item> {
    int size;
    LinkedList<Item>[] items;
    
    public SeparateChainHash(int size){
        items = new LinkedList[size];
        for(int index = 0; index < size; index++){
            items[index] = new LinkedList<>();
        }
        this.size = size;
    }
    
    public int hash(Item item){
        return (item.hashCode() & 0x7ffffff) % size;
    }
    
    public void addElement(Item item, Item fileName){
        int index = hash(item);
        if(!items[index].hasItem(item))
            items[index].insertFirst(item);   
        items[index].insertLast((Item) fileName);
    }
    
    public String toString(String string) {
        String str = "";
        int hashCode = hash((Item) string);
        str += items[hashCode];
        return str;
    }
    
}
    /*public String toString(Item item){
        int index = hash(item);
        String msg = "";
        if(items[index] != null){
            msg += index + "th appears at: " + items[index].toString();
        }
        return msg;
    } */

