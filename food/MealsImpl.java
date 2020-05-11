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
            List<String> ingredients = new ArrayList<>();
            ingredients.add("Chicken");
            List<String> condiments = new ArrayList<>();
            condiments.add("Sauce");
            Food chickenBurgerWithSauce = new Condiments("Chicken Burger", 100,ingredients,condiments);
            meal.add(cocaCola);
            meal.add(chickenBurgerWithSauce);
        }else if(mealName.equals("Fish Burger and Sprite")){
            Food sprite = new Drinks("sprite",80,250);
            List<String> ingredients = new ArrayList<>();
            ingredients.add("Fish");
            Food fishBurger = new Beverages("Chicken Burger", 100,ingredients);
            meal.add(sprite);
            meal.add(fishBurger);
        }else if(mealName.equals("Vege Burger with spices and Water")){
            List<String> ingredients = new ArrayList<>();
            ingredients.add("Vegetables");
            List<String> condiments = new ArrayList<>();
            condiments.add("Spice");
            meal.add(new Condiments().setCondiments(condiments).setIngredients(ingredients).setName("Vege Burger").setPrice(50));
            meal.add(new Drinks().setSize(100).setName("Water").setPrice(40));
        } else if(mealName.equals("Egg Burger and Pepsi")){
            List<String> ingredients = new ArrayList<>();
            ingredients.add("Egg");
            meal.add(new Beverages().setIngredients(ingredients).setName("Egg Burger").setPrice(70));
            meal.add(new Drinks().setSize(100).setName("Pepsi").setPrice(80));
        }
        return meal;
    }
    
}