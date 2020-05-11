package food.beverages;

import food.Food;

public class Beverages extends Food{
    
    protected String ingredients;

    public Beverages(){
        super();
    }

    public Beverages(String name,float price,String ingrediets){
        super(name,price);
        this.ingredients = ingrediets;
    }

    public String getIngredients(){
        return ingredients;
    }
    public Beverages setIngredients(String ingredients) {
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