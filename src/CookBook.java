import java.util.ArrayList;

public class CookBook {
    private String Recipe_item_1;
    private String Recipe_item_2;
    private String Recipe_item_3;
    private String Recipe_item_4;
    private ArrayList<Main> Recipe_list_1;
    private ArrayList<Main> Recipe_list_2;

    public CookBook(String recipe_item_1, String recipe_item_2, String recipe_item_3, String recipe_item_4, ArrayList<Main> recipe_list_1, ArrayList<Main> recipe_list_2) {
        Recipe_item_1 = recipe_item_1;
        Recipe_item_2 = recipe_item_2;
        Recipe_item_3 = recipe_item_3;
        Recipe_item_4 = recipe_item_4;
        Recipe_list_1 = recipe_list_1;
        Recipe_list_2 = recipe_list_2;
    }

    public String getRecipe_item_1() {
        return Recipe_item_1;
    }

    public void setRecipe_item_1(String recipe_item_1) {
        Recipe_item_1 = recipe_item_1;
    }

    public String getRecipe_item_2() {
        return Recipe_item_2;
    }

    public void setRecipe_item_2(String recipe_item_2) {
        Recipe_item_2 = recipe_item_2;
    }

    public String getRecipe_item_3() {
        return Recipe_item_3;
    }

    public void setRecipe_item_3(String recipe_item_3) {
        Recipe_item_3 = recipe_item_3;
    }

    public String getRecipe_item_4() {
        return Recipe_item_4;
    }

    public void setRecipe_item_4(String recipe_item_4) {
        Recipe_item_4 = recipe_item_4;
    }

    public ArrayList<Main> getRecipe_list_1() {
        return Recipe_list_1;
    }

    public void setRecipe_list_1(ArrayList<Main> recipe_list_1) {
        Recipe_list_1 = recipe_list_1;
    }

    public ArrayList<Main> getRecipe_list_2() {
        return Recipe_list_2;
    }

    public void setRecipe_list_2(ArrayList<Main> recipe_list_2) {
        Recipe_list_2 = recipe_list_2;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "Recipe_item_1='" + Recipe_item_1 + '\'' +
                ", Recipe_item_2='" + Recipe_item_2 + '\'' +
                ", Recipe_item_3='" + Recipe_item_3 + '\'' +
                ", Recipe_item_4='" + Recipe_item_4 + '\'' +
                ", Recipe_list_1=" + Recipe_list_1 +
                ", Recipe_list_2=" + Recipe_list_2 +
                '}';
    }
}
