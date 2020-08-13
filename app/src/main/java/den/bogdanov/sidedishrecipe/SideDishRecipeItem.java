package den.bogdanov.sidedishrecipe;

public class SideDishRecipeItem {

    private int imageResource;
    private String title;
    private String description;
    private String recipe;

    public SideDishRecipeItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
