import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import food.Food;
import food.Meals;
import food.MealsImpl;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Chicken burger with sauce and coca cola\t=\t1");
        System.out.println("Fish Burger and Sprite\t\t\t=\t2");
        System.out.println("Vege Burger with spices and Water\t=\t3");
        System.out.println("Egg Burger and Pepsi\t\t\t=\t4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Meal Type : ");
        int type = sc.nextInt();
        sc.close();
        List<Food> mealList = new ArrayList<>();
        Meals meal = new MealsImpl();
        if(type ==1){
            System.out.println("Chicken burger with sauce and coca cola : ");
            mealList = meal.getMeal("Chicken burger with sauce and coca cola");
            for (Food food : mealList) {
                System.out.println(food.toString());
            }
            
        }else if(type ==2){
            System.out.println("Fish Burger and Sprite : ");
            mealList = meal.getMeal("Fish Burger and Sprite");
            for (Food food : mealList) {
                System.out.println(food.toString());
            }
        }else if(type ==3){
            System.out.println("Vege Burger with spices and Water : ");
            mealList = meal.getMeal("Vege Burger with spices and Water");
            for (Food food : mealList) {
                System.out.println(food.toString());
            }
        }else if(type ==4){
            System.out.println("Egg Burger and Pepsi : ");
            mealList = meal.getMeal("Egg Burger and Pepsi");
            for (Food food : mealList) {
                System.out.println(food.toString());
            }
        }
        System.out.println("Total Price : "+meal.getPrice(mealList));
        


    }
    
}