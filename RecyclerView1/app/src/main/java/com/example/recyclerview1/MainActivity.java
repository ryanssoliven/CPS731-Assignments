package com.example.recyclerview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mRecipes = new ArrayList<>();
    private ArrayList<String> mPreviews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn3.tmbi.com/toh/GoogleImagesPostCard/Savory-Beef-Sandwiches_EXPS_HSCBZ17_9191_B07_27_4b.jpg");
        mNames.add("Beef Sandwich");
        mRecipes.add("Peanut butter and jelly sandwiches were originally considered a delicacy, only enjoyed by those of the upper class.");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://thecookful.com/wp-content/uploads/2019/05/how-to-grilled-cheese-1392-x780.jpg");
        mNames.add("Grilled Cheese Sandwiches");
        mRecipes.add("In 1927, MGM’s lion was in a plane crash and survived on milk, water, and sandwiches");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://pinchofyum.com/wp-content/uploads/Chicken-Sandwich-Feature-1.jpg");
        mNames.add("Chicken Sandwich");
        mRecipes.add("A Chicago man once robbed a Subway and then crossed the street to buy a Potbelly sandwich with the money");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190322-ham-sandwich-horizontal-1553721016.png");
        mNames.add("Ham Sandwiches");
        mRecipes.add("Iran tried to get into the Guinness book of world records by making the world’s largest sandwich. But people started eating it before it could be officially measured so they failed.");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://www.foxvalleyfoodie.com/wp-content/uploads/2018/07/roasted-pork-sandwich-feature.jpg");
        mNames.add("Pork Sandwich");
        mRecipes.add("A Minnesota-based YouTuber once made a chicken sandwich literally from scratch. He grew a garden, harvested wheat, slaughtered a chicken, traveled to boil ocean water for salt, etc. It took him 6 months and cost him $1,500. He didn’t think it tasted very good.");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://www.simplyrecipes.com/wp-content/uploads/2018/07/Add-ins-for-tuna-salad-2.jpg");
        mNames.add("Tuna Sandwich");
        mRecipes.add("31% of the calories and 60% of the Fat in Burger King’s sandwich comes from the mayonnaise alone.");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://cook.fnr.sndimg.com/content/dam/images/cook/fullset/2011/2/3/0/CCFTK104_California-Style-Turkey-Sandwich_s4x3.jpg.rend.hgtvcom.826.620.suffix/1357778061885.jpeg");
        mNames.add("Turkey Sandwich");
        mRecipes.add("PreviewsAccording to the United States Department of Agriculture, a sandwich must contain at least 35 percent cooked meat and no more than 50 percent bread.");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2016/11/3/2/NLV-Crave-Worthy_breakfast-sandwich_s4x3.jpg.rend.hgtvcom.826.620.suffix/1478289713133.jpeg");
        mNames.add("Egg Sandwich");
        mRecipes.add("The sandwich is named after John Montagu, 4th Earl of Sandwich, an eighteenth-century English aristocrat. It is said that he ordered his valet to bring him meat tucked between two pieces of bread");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        mImageUrls.add("https://hips.hearstapps.com/del.h-cdn.co/assets/17/08/1487862595-meatball-subl1-1.jpg");
        mNames.add("Meatball Sandwich");
        mRecipes.add("Rather than attacking a meatball sub like you would any other sandwich with all your fingers on the top and the thumbs on the bottom, try thumbs and pinky fingers on the bottom with the remaining fingers on top");
        mPreviews.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mRecipes, mPreviews);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















