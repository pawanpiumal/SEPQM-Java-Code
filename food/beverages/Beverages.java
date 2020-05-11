package food.beverages;

import java.util.List;
import food.Food;

public class Beverages extends Food{
    
    protected List<String> ingredients;

    public Beverages(){
        super();
    }

    public Beverages(String name,float price,List<String> ingrediets){
        super(name,price);
        this.ingredients = ingrediets;
    }

    public List<String> getIngredients(){
        return ingredients;
    }
    public Food setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }
    
    @Override
    public String toString(){
        return "Name : "+name+",\n"+
        "Price : "+price+",\n"+
        "Ingredients : "+ingredients.toString();
    }


}