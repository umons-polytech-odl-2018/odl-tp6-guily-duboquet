package Main;

import java.util.ArrayList;

public abstract class PizzaComposite implements Food {
    String name;
    ArrayList<IngredientsFeuille> ingredients;


    public PizzaComposite (String name, double price){
        this.name = name;
        ingredients = new ArrayList<>();
    }
    public void addingredient (IngredientsFeuille ingredient){this.ingredients.add(ingredient);}
    @Override
    public double getPrice() {
        double price = 0;
        return price;
    }

    @Override
    public String getName() {
        return null;
    }

}
