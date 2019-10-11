package day;

public enum DayType {
    SUN("Sun"), MON("Mon"), TUES("Tues"), WEDN("Wed"),
    THUR("Thur"), FRI("Fri"), SAT("Sat");
    private final String printMark;

    DayType(String printMark) {
        this.printMark = printMark;
    }

    public String getPrintMark() {
        return printMark;
    }

}