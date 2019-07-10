public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "meat":
                this.toppingType = toppingType;
                break;
            case "veggies":
                this.toppingType = toppingType;
                break;
            case "cheese":
                this.toppingType = toppingType;
                break;
            case "sauce":
                this.toppingType = toppingType;
                break;

            default:
                validateToppings(toppingType);
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            validateWeight(this.toppingType);
        }
//TODO implement modifiers
        this.weight = weight * 2;
    }

    private void validateToppings(String input) {
        throw new IllegalArgumentException(String.format(
                "Cannot place %s on top of your pizza.",
                input));
    }

    private void validateWeight(String toppingType) {
        throw new IllegalArgumentException(String.format(
                "%s weight should be in the range [1..50].",
                toppingType));
    }
}
