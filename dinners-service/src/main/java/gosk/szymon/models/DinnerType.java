package gosk.szymon.models;

import org.jetbrains.annotations.Contract;

public enum DinnerType {

    NORMAL("normalny"),
    VEGETARIAN("wegetariański"),
    DIARY_FREE("bezmleczny"),
    GLUTEN_FREE("bezglutenowy");

    private final String verbose;

    @Contract(pure = true)
    DinnerType(String verbose) {
        this.verbose = verbose;
    }

    @Contract(pure = true)
    public String getVerbose() {
        return verbose;
    }

}
