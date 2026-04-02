import { Item } from "../types/Item";
import updateQuality from "./updateQuality";

export const main = () => {
    let items: Item[] = [
        { name: "+5 Dexterity Vest", sellIn: 10, quality: 20 },
        { name: "Aged Brie", sellIn: 2, quality: 0 },
        { name: "Elixir of the Mongoose", sellIn: 5, quality: 7 },
        { name: "Sulfuras, Hand of Ragnaros", sellIn: 0, quality: 80 },
        { name: "Sulfuras, Hand of Ragnaros", sellIn: -1, quality: 80 },
        { name: "Backstage passes to a TAFKAL80ETC concert", sellIn: 15, quality: 20 },
        { name: "Backstage passes to a TAFKAL80ETC concert", sellIn: 10, quality: 49 },
        { name: "Backstage passes to a TAFKAL80ETC concert", sellIn: 5, quality: 49 },
        { name: "Conjured Mana Cake", sellIn: 3, quality: 6 }
    ];

    for (let i = 0; i < 31; i++) {
        console.log("-------- day " + i + " --------");
        console.log("name, sellIn, quality");
        for (let j = 0; j < items.length; j++) {
            console.log(Object.values(items[j]).join(", "));
         }
         console.log('\n');
        items = updateQuality(items);
    }
};

main();