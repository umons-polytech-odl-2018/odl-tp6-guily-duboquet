package Main;

public class IngredientsFeuille implements Food {
    private String name;
    private double price;

    public IngredientsFeuille(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {

        return null ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString(){
        return "Main.Food(" + "name=" + name + "price=" + price + "€).";
    }
}
