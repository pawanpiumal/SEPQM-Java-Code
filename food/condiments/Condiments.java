package food.condiments;

import food.Food;
import food.beverages.Beverages;

public class Condiments extends Beverages{

    private Food condiments;

    public Condiments(){

    }

    public Condiments(String name, float price, String ingrediets, Food condiments){
        super(name,price, ingrediets);
        this.condiments = condiments;
    }

    public Food getCondiments(){
        return condiments;
    }
    public Condiments setCondiments(Food condiments){
        this.condiments = condiments;
        return this;
    }

    @Override
    public String toString(){
        return "Name : "+name+",\n"+
        "Price : "+price+",\n"+
        "Ingredients : "+ingredients+",\n+"+
        "Condiments : "+condiments.toString();
    }

}