public class TestSandwich {
    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich("Turkey", "Multigrain", 6.49);
        System.out.println("Initial Sandwich Details:");
        displaySandwichDetails(mySandwich);
        mySandwich.setMainIngredient("Chicken");
        mySandwich.setBreadType("Whole Wheat");
        mySandwich.setPrice(7.99);
        System.out.println("\nUpdated Sandwich Details:");
        displaySandwichDetails(mySandwich);
    }
    public static void displaySandwichDetails(Sandwich sandwich) {
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());
        System.out.println();
    }
}
