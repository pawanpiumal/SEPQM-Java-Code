package food;

import java.util.ArrayList;
import java.util.List;

import food.beverages.Beverages;
import food.condiments.Condiments;
import food.drinks.Drinks;

public class MealsImpl implements Meals {

    @Override
    public List<Food> getMeal(String mealName) {
        List<Food> meal = new ArrayList<>();
        if(mealName.equals("Chicken burger with sauce and coca cola")){
            Food cocaCola = new Drinks("Coca Cola",100,250);
            Food sauce = new Food("sauce",10);
            Food chickenBurgerWithSauce = new Condiments("Chicken Burger", 100,"Chicken",sauce);
            meal.add(cocaCola);
            meal.add(chickenBurgerWithSauce);
        }else if(mealName.equals("Fish Burger and Sprite")){
            Food sprite = new Drinks("sprite",80,250);
            Food fishBurger = new Beverages("Chicken Burger", 100,"Fish");
            meal.add(sprite);
            meal.add(fishBurger);
        }else if(mealName.equals("Vege Burger with spices and Water")){
            Food spice = new Food().setName("Spice").setPrice(10);
            meal.add(new Condiments().setCondiments(spice).setIngredients("Vegetables").setName("Vege Burger").setPrice(50));
            meal.add(new Drinks().setSize(100).setName("Water").setPrice(40));
        } else if(mealName.equals("Egg Burger and Pepsi")){
            meal.add(new Beverages().setIngredients("Egg").setName("Egg Burger").setPrice(70));
            meal.add(new Drinks().setSize(100).setName("Pepsi").setPrice(80));
        }
        return meal;
    }

    @Override
    public float getPrice(List<Food> meal) {
        float price=0;

        for (Food food : meal) {
            
        }

        return 0;
    }
    
}