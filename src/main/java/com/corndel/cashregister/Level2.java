package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    // which item names are coins?
    List<String> coinNames = Arrays.asList("quarter", "dime", "nickel", "penny");

    int sumCoins = 0;

    // loop over each item in the drawer
    for(Item item : drawer){
      // is this item a coin? if so add quantity
      if(coinNames.contains(item.getName())){
        sumCoins += item.getQuantity();
      }
    }
    return sumCoins;
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {
    List<String> coinNames = Arrays.asList("quarter", "dime", "nickel", "penny");

    int sumNotes = 0;
    for(Item item : drawer){
      // if NOT coin, must be a note
      if(!coinNames.contains(item.getName())){
        sumNotes += item.getQuantity();
      }
    }
    return sumNotes;
  }
}
