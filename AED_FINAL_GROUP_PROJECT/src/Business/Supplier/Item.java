/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

/**
 *
 * @author yashrevadekar
 */
public class Item {
     private String itemId;
    private static int sCount=1;
    private int quantity;
    private String requirementType;
    private String requirement;
    //item class constructor to autogenerate id
    public Item(){
        itemId="Item"+(+sCount);        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }
    
    @Override
    public String toString(){
        return getRequirementType();
    }

}
