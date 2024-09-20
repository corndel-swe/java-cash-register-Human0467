package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    int remaining = target;

    // loop over each denomination
    for(Item item : drawer){
      // do we have this denomination left? Do we still have change to make up?
      while(item.getQuantity() > 0 && remaining > 0){
        // is the remaining amount larger than the current value?
        if(remaining - item.getValue() >= 0){
          // reduce the remaining change needed
          remaining -= item.getValue();
          // remove the used note/coin from the drawer
          item.setQuantity( item.getQuantity() - 1 );
        }else{
          // if this note/coin is too big, go to the next one
          break;
        }
      }
    }
    // if we have reduced the remaining change needed to 0 return true, otherwise false
    return remaining == 0;

    // ** issue as even if returning false, we have already altered the drawer. Should
    // change to work with a clone of drawer instead of the actual object?
  }
}
