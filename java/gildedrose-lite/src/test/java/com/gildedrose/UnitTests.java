package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UnitTests {

    /*
    * This is an example test, where we instantiate our app with the item 'foo'.
    * Please fix me and removed the disabled tag :)
    */
    @Test
    @Disabled
    void foo() {
        Item[] items = new Item[] { new Item("foo", 10, 10) };
        GildedRose app = new GildedRose(items);
        int days = 5;
        for (int i = 0; i < days; i++) {
            app.updateQuality();
        }
        assertEquals("foo", app.items[0].name);
        assertTrue( app.items[0].quality > 10);
    }



}
