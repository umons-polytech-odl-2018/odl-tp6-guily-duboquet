import java.util.ArrayList;

public class main {


    public abstract class PizzaComposite implements Food {
        String name;
        ArrayList<IngredientsFeuille> ingredients;


        public PizzaComposite (String name, float price){
            this.name = name;
            ingredients = new ArrayList<>();
        }
        public void addingredient (IngredientsFeuille ingredient){this.ingredients.add(ingredient);}
        @Override
        public float getPrice() {
            float price = 0;
        }

    }

}
