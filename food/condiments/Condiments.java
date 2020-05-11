package food.condiments;

import java.util.List;

import food.beverages.Beverages;

public class Condiments extends Beverages{

    private List<String> condiments;

    public Condiments(){

    }

    public Condiments(String name, float price, List<String> ingrediets, List<String> condiments){
        super(name,price, ingrediets);
        this.condiments = condiments;
    }

    public List<String> getCondiments(){
        return condiments;
    }
    public Condiments setCondiments(List<String> condiments){
        this.condiments = condiments;
        return this;
    }

    @Override
    public String toString(){
        return "Name : "+name+",\n"+
        "Price : "+price+",\n"+
        "Ingredients : "+ingredients.toString()+",\n+"+
        "Condiments : "+condiments.toString();
    }

}