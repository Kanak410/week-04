package org.example.personalizedmealPlanGenerator;

class Meal<T extends MealPlan> {
    private String mealName;
    private T mealType;

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return "Meal: " + mealName + " (" + mealType.getMealType() + ")";
    }
}

// Utility class for Meal Plan Generation
class MealPlanUtils {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Generating meal plan: " + meal);
    }
}
