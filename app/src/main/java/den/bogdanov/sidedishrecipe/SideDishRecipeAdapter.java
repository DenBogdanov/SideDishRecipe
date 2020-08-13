package den.bogdanov.sidedishrecipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SideDishRecipeAdapter extends RecyclerView.Adapter<SideDishRecipeAdapter.SideDishRecipeViewHolder> {

    ArrayList<SideDishRecipeItem> sideDishRecipeItems;
    Context context;

    public SideDishRecipeAdapter(ArrayList<SideDishRecipeItem> sideDishRecipeItems, Context context) {
        this.sideDishRecipeItems = sideDishRecipeItems;
        this.context = context;
    }

    @NonNull
    @Override
    public SideDishRecipeAdapter.SideDishRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.side_dish_recipe_item, parent, false);

        SideDishRecipeViewHolder sideDishRecipeViewHolder = new SideDishRecipeViewHolder(view);
        return sideDishRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SideDishRecipeViewHolder holder, int position) {

        SideDishRecipeItem sideDishRecipeItem = sideDishRecipeItems.get(position);

        holder.sideDishImageView.setImageResource(sideDishRecipeItem.getImageResource());
        holder.title.setText(sideDishRecipeItem.getTitle());
        holder.description.setText(sideDishRecipeItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return sideDishRecipeItems.size();
    }

    class SideDishRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView sideDishImageView;
        public TextView title;
        public TextView description;

        public SideDishRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            sideDishImageView = itemView.findViewById(R.id.sideDishImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            SideDishRecipeItem sideDishRecipeItem = sideDishRecipeItems.get(position);

            Intent intent =new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", sideDishRecipeItem.getImageResource());
            intent.putExtra("title", sideDishRecipeItem.getTitle());
            intent.putExtra("description", sideDishRecipeItem.getDescription());
            intent.putExtra("recipe", sideDishRecipeItem.getRecipe());
            context.startActivity(intent);

        }
    }
}
