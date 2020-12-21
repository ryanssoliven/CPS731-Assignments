package com.example.masterd.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();

   // private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Beef Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://cdn3.tmbi.com/toh/GoogleImagesPostCard/Savory-Beef-Sandwiches_EXPS_HSCBZ17_9191_B07_27_4b.jpg"));
        addItem(new DummyItem("2","Grilled Cheese Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://thecookful.com/wp-content/uploads/2019/05/how-to-grilled-cheese-1392-x780.jpg"));
        addItem(new DummyItem("3","Chicken Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://pinchofyum.com/wp-content/uploads/Chicken-Sandwich-Feature-1.jpg"));
        addItem(new DummyItem("4","Ham Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190322-ham-sandwich-horizontal-1553721016.png"));
        addItem(new DummyItem("5","Pork Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://www.foxvalleyfoodie.com/wp-content/uploads/2018/07/roasted-pork-sandwich-feature.jpg"));
        addItem(new DummyItem("6","Tuna Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://www.simplyrecipes.com/wp-content/uploads/2018/07/Add-ins-for-tuna-salad-2.jpg"));
        addItem(new DummyItem("7","Turkey Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://cook.fnr.sndimg.com/content/dam/images/cook/fullset/2011/2/3/0/CCFTK104_California-Style-Turkey-Sandwich_s4x3.jpg.rend.hgtvcom.826.620.suffix/1357778061885.jpeg"));
        addItem(new DummyItem("8","Egg Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2016/11/3/2/NLV-Crave-Worthy_breakfast-sandwich_s4x3.jpg.rend.hgtvcom.826.620.suffix/1478289713133.jpeg"));
        addItem(new DummyItem("9","Meatball Sandwich","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://hips.hearstapps.com/del.h-cdn.co/assets/17/08/1487862595-meatball-subl1-1.jpg"));
        // Add some sample items.
       // for (int i = 1; i <= COUNT; i++) {
     //       addItem(createDummyItem(i));
     //   }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

   // private static DummyItem createDummyItem(int position) {
   //     return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
   // }

   // private static String makeDetails(int position) {
    //    StringBuilder builder = new StringBuilder();
     //   builder.append("Details about Item: ").append(position);
    //    for (int i = 0; i < position; i++) {
    //        builder.append("\nMore details information here.");
   //     }
   //     return builder.toString();
    //}

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String pics;

        public DummyItem(String id, String content, String details, String pics) {
            this.id = id;
            this.content = content;
            this.pics = pics;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}