package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

/**
 * you can use this example drawer to do some debugging
 *
 * <p>
 * note that we usually represent money in integers not decimals:
 * 
 * @see https://blog.agentrisk.com/you-better-work-in-cents-not-dollars-2edb52cdf308
 */
public class Drawer {
  public static List<Item> drawer = List.of(
      new Item("hundred", 10000, 1),
      new Item("twenty", 2000, 3),
      new Item("ten", 1000, 2),
      new Item("five", 500, 11),
      new Item("one", 100, 90),
      new Item("quarter", 25, 17),
      new Item("dime", 10, 31),
      new Item("nickel", 5, 41),
      new Item("penny", 1, 72));
}

