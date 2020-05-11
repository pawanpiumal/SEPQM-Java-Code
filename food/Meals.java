package food;

import java.util.List;

public interface Meals {

    public List<Food> getMeal(String mealName);
    public float getPrice(List<Food> meal);

    
    
}