package gosk.szymon.models;

import org.jetbrains.annotations.Contract;

public enum ClassLevel {

    A1("1A"),
    B1("1B"),
    A2("2A"),
    B2("2B"),
    A3("3A"),
    B3("3B"),
    EMPLOYEE("");

    private final String verbose;

    @Contract(pure = true)
    ClassLevel(String verbose) {
        this.verbose = verbose;
    }

    @Contract(pure = true)
    public String getVerbose() {
        return verbose;
    }

}
