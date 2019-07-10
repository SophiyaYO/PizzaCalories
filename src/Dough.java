public class Dough {
    private final static double WHITE_DEFAULT_CALORIES = 1.5;
    private final static double WHOLEGRAIN_DEFAULT_CALORIES = 1.0;
    private final static double CRISPY_DEFAULT_CALORIES = 0.9;
    private final static double CHEWY_DEFAULT_CALORIES = 1.1;
    private final static double HOMEMADE_DEFAULT_CALORIES = 1.0;

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
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

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            validateDoughWeight();
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = (weight * 2);

        calories *= this.doughModifiersByType(this.flourType);
        calories *= this.doughModifiersByTechnique(this.bakingTechnique);

        return calories;

    }

    private double doughModifiersByTechnique(String bakingTechnique) {
        double techniqueModifier = 0d;

        switch (bakingTechnique) {
            case "crispy":
                techniqueModifier = CRISPY_DEFAULT_CALORIES;
                break;
            case "chewy":
                techniqueModifier = CHEWY_DEFAULT_CALORIES;
                break;
            case "homemade":
                techniqueModifier = HOMEMADE_DEFAULT_CALORIES;
                break;
        }

        return techniqueModifier;
    }

    private double doughModifiersByType(String flourType) {
        double typeModifier = 0d;

        switch (flourType) {
            case "white":
                typeModifier = WHITE_DEFAULT_CALORIES;
                break;
            case "wholegrain":
                typeModifier = WHOLEGRAIN_DEFAULT_CALORIES;
                break;
        }

        return typeModifier;
    }

    private void validateDoughWeight() {
        throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    private void validateFlourType() {
        throw new IllegalArgumentException("Invalid type of dough.");
    }


}
