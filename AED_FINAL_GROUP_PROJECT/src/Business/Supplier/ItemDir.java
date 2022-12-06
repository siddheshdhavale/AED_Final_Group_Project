/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class ItemDir {
     private ArrayList<Item> itemList;
    
    public ItemDir() {
        itemList=new ArrayList<>();
        
    }

    public ArrayList<Item> getSupplyList() {
        return itemList;
    }

    public void setSupplyList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    //add a new item
    public Item addSupply(){
        Item s = new Item();
        itemList.add(s);
        return s;
    }
    //remove item
    public void removeSupply(Item item){
        itemList.remove(item);
    }
}
