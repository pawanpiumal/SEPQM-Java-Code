package food.snacks;

import food.Food;

public class Snacks extends Food{
    protected String ingredients;

    public Snacks(){
        super();
    }
    public Snacks(String name,float price,String ingrediets){
        super(name,price);
        this.ingredients = ingrediets;
    }

    public String getIngredients(){
        return ingredients;
    }
    public Snacks setIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }
    
    @Override
    public String toString(){
        return "Name : "+name+", "+
        "Price : "+price+", "+
        "Ingredients : "+ingredients;
    }
}