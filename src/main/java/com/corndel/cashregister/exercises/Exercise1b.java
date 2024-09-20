package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise1b {
  /**
   * This function changes the recipeBook's name to the newName and then returns
   * the updated recipeBook
   */
  public static RecipeBook renameBook(RecipeBook recipeBook, String newName) {
    // TODO
    recipeBook.setTitle(newName);
    return recipeBook;
  }
}
