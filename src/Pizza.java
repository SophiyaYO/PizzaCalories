import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Toppings> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()
                || name.length() == 0 || name.length() > 15) {
            validatePizzaName();
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            validateNumberOfToppings();
        }

        this.toppings = new ArrayList<>(toppings);
    }

    private void validatePizzaName() {
        throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }

    private void validateNumberOfToppings() {
        throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
    }

}
