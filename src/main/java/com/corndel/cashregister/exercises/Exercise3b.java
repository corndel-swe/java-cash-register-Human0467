package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {

    int totalServings = 0;
    for(Recipe recipe : recipeBook.recipes){
      totalServings += recipe.getServings();
    }
    return totalServings;
  }
}
