package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {
  /**
   * Calculates the total value of all money in the drawer.
   */
  public static int sumDrawer(List<Item> drawer) {
    int totalInCents = 0;

    // loop over every item in the drawer
    for(Item item : drawer){
      totalInCents += (item.getQuantity() * item.getValue());
    }
    return totalInCents;
  }
}
