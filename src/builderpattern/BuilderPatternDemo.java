package builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("Veg meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        System.out.println("Chicken meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());


    }
}
