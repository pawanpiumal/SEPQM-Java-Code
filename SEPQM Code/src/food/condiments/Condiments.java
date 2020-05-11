package food.condiments;

import food.Food;
import food.snacks.Snacks;

public class Condiments extends Snacks{

    private Food condiments;

    public Condiments(){
        super();
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
        return "Name : "+name+", "+
        "Price : "+price+", "+
        "Ingredients : "+ingredients+", "+
        "Condiments : "+condiments.getName();
    }

}