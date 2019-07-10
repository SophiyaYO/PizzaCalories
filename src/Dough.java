public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "crispy":
                this.bakingTechnique = bakingTechnique;
                break;
            case "chewy":
                this.bakingTechnique = bakingTechnique;
                break;
            case "homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                validateFlourType();
        }
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "white":
                this.flourType = flourType;
                break;
            case "wholegrain":
                this.flourType = flourType;
                break;
            default:
                validateFlourType();
                break;

        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            validateDoughWeight();
        }

        this.weight = weight;
    }

    //TODO do the Toppings and then this
    public double calculateCalories() {
        return 0;
    }

    private void validateDoughWeight() {
        throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    private void validateFlourType() {
        throw new IllegalArgumentException("Invalid type of dough.");
    }


}
