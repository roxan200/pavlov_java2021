package lab37;

enum ExerciseOption {
    pressUp, skippingRope, squats;

    //добавлено только ради junit-тестов----------
    public final int pressUpCalories = 19;
    public final int skippingRopeCalories = 11;
    public final int squatsCalories = 13;
    //--------------------------------------------

    //количество сожжённых калорий в секунду
    int caloriesPerSec() {
        return switch (this) {
            case pressUp        -> pressUpCalories;
            case skippingRope   -> skippingRopeCalories;
            case squats         -> squatsCalories;
            default             -> 0;
        };
    }

    //распознавание типа упражнения
    static ExerciseOption stringToEnum(String text) {
        if (text.contains("press up") || text.contains("press-up")) {
            return pressUp;
        } else if (text.contains("rope") || text.contains("skipping")) {
            return skippingRope;
        } else if (text.contains("squats")) {
            return squats;
        } else {
            return null;
        }
    }
}