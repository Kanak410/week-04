package org.example.personalizedmealPlanGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testMealCreation() {
        Meal<VeganMeal> veganMeal = new Meal<>("Vegan Smoothie", new VeganMeal());

        assertEquals("Vegan Smoothie", veganMeal.getMealName());
        assertEquals("Vegan Meal", veganMeal.getMealType().getMealType());
        assertEquals("Meal: Vegan Smoothie (Vegan Meal)", veganMeal.toString());
    }
}
