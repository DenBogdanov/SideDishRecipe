package den.bogdanov.sidedishrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SideDishRecipeItem> sideDishRecipeItems = new ArrayList<>();
        sideDishRecipeItems.add(new SideDishRecipeItem(R.drawable.recipe_1, Utils.SIDE_DISH_1_TITLE, Utils.SIDE_DISH_1_DESCRIPTION, Utils.SIDE_DISH_1_RECIPE));
        sideDishRecipeItems.add(new SideDishRecipeItem(R.drawable.recipe_2, Utils.SIDE_DISH_2_TITLE, Utils.SIDE_DISH_2_DESCRIPTION, Utils.SIDE_DISH_2_RECIPE));
        sideDishRecipeItems.add(new SideDishRecipeItem(R.drawable.recipe_3, Utils.SIDE_DISH_3_TITLE, Utils.SIDE_DISH_3_DESCRIPTION, Utils.SIDE_DISH_3_RECIPE));
        sideDishRecipeItems.add(new SideDishRecipeItem(R.drawable.recipe_4, Utils.SIDE_DISH_1_TITLE, Utils.SIDE_DISH_4_DESCRIPTION, Utils.SIDE_DISH_4_RECIPE));
        sideDishRecipeItems.add(new SideDishRecipeItem(R.drawable.recipe_5, Utils.SIDE_DISH_5_TITLE, Utils.SIDE_DISH_5_DESCRIPTION, Utils.SIDE_DISH_5_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new SideDishRecipeAdapter(sideDishRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}