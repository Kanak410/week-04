package org.example.personalizedmealPlanGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MealPlanTest {

    @Test
    void testVegetarianMeal() {
        VegetarianMeal vegMeal = new VegetarianMeal();
        assertEquals("Vegetarian Meal", vegMeal.getMealType());
    }

    @Test
    void testVeganMeal() {
        VeganMeal veganMeal = new VeganMeal();
        assertEquals("Vegan Meal", veganMeal.getMealType());
    }

    @Test
    void testKetoMeal() {
        KetoMeal ketoMeal = new KetoMeal();
        assertEquals("Keto Meal", ketoMeal.getMealType());
    }

    @Test
    void testHighProteinMeal() {
        HighProteinMeal proteinMeal = new HighProteinMeal();
        assertEquals("High-Protein Meal", proteinMeal.getMealType());
    }
}
