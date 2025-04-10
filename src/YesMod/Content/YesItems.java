package YesMod.Content;

import arc.graphics.Color;
import mindustry.type.Item;

public class YesItems {

    //Load Mod Items

    public static Item
            nickel;

    public static void load() {
        nickel = new Item("nickel") {{
            cost = 5;
            color = Color.valueOf("cbbd8a");
        }};
    }
}
