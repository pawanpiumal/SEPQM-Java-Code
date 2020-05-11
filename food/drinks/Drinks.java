package food.drinks;

import food.Food;

public class Drinks extends Food{

    private float size;

    public Drinks(){

    }
    public Drinks(String name,float price,float size){
        super(name,price);
        this.size = size;
    }

    public float getSize(){
        return size;
    }
    public Drinks setSize(float size){
        this.size=size;
        return this;
    }

    public String toString(){
        return "Name : "+name+", "+
        "Price : "+price+", "+
        "Size : "+size;
    }
    
}