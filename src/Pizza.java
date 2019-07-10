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

    }

}
