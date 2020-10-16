public class YearCheck {
    public boolean isLeap(int year){
        boolean resultMod4 = (year % 4 == 0);
        boolean resultMod100 = (year % 100 == 0);
        boolean resultMod400 = (year % 400 == 0);
        return ((resultMod4 && !resultMod100) || resultMod400);
    }
}
