/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author yashrevadekar
 */
public class Supplier {
    private String sName;
    private static int sCount=1;
    private String supplierId;
    private TaskQueue taskQueue;
    private ItemDir itemDir;
    private Item item;
    //Supplier class constructor to update ids, work queue and item directory
    public Supplier() {
        
        supplierId = "SUP"+(++sCount);
        taskQueue= new TaskQueue();
        itemDir = new ItemDir();
        item = new Item();
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public ItemDir getItemDir() {
        return itemDir;
    }

    public void setItemDirectory(ItemDir itemDir) {
        this.itemDir = itemDir;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }
    
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString(){
        return sName;
    }
}
