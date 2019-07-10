import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Toppings> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()
                || name.length() == 0 || name.length() > 15) {
            validatePizzaName();
        }

        this.name = name;
    }

    private void validatePizzaName() {
        throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }

}
