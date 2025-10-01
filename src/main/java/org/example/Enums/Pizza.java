package org.example.Enums;

public class Pizza {
    public PizzaStatus status;

    public boolean isDeliverable(){
        if(getStatus() == PizzaStatus.DELIVERED){
            return true;
        }
        return false;
    }
    public PizzaStatus getStatus(){
        return status;
    }
}
