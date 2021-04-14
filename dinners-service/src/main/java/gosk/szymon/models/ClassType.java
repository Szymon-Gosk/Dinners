package gosk.szymon.models;

import org.jetbrains.annotations.Contract;

public enum ClassType {

    MID_SCHOOL("gimnazjum"),
    HIGH_SCHOOL("liceum"),
    EMPLOYEE("pracownik");

    private final String verbose;

    @Contract(pure = true)
    ClassType(String verbose) {
        this.verbose = verbose;
    }

    @Contract(pure = true)
    public String getVerbose() {
        return verbose;
    }

}
