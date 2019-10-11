package day;

public class TestDayType {
    public static void main(String[] args) {
        DayType[] typeValues = DayType.values();
        for (int i = 0 ; i < typeValues.length; i++)
            System.out.println(typeValues[i].getPrintMark());
    }
}
