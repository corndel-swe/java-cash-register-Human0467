package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class Exercise2b {
  /**
   * Given a list of recipes, return a new list of strings containing just the
   * name of each recipe
   */
  public static List<String> listNames(List<Recipe> recipes) {
    // TODO
    List<String> recipeNames = new ArrayList<String>();
    for(Recipe recipe : recipes){
      recipeNames.add(recipe.getName());
    }
    return recipeNames;
  }
}
