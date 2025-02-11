package org.example.personalizedmealPlanGenerator;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>("Salad Bowl", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("Vegan Smoothie", new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("Grilled Chicken", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>("Protein Shake", new HighProteinMeal());

        System.out.println("Available Meal Plans:");
        MealPlanUtils.generateMealPlan(vegMeal);
        MealPlanUtils.generateMealPlan(veganMeal);
        MealPlanUtils.generateMealPlan(ketoMeal);
        MealPlanUtils.generateMealPlan(proteinMeal);
    }
}
