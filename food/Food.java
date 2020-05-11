package food;

public class Food {

    protected String name;
    protected float price;

    public Food(){

    }

    public Food(String name,float price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public Food setName(String name){
        this.name=name;
        return this;
    }
    public Food setPrice(float price){
        this.price=price;
        return this;
    }
    

    public String toString(){
        return "Name : "+name+", "+
        "Price : "+price;
    }
}