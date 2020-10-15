public class YearCheck {
    private boolean resultMod4;
    private boolean resultMod100;
    private boolean resultMod400;

    public boolean isLeap(int year){
        this.resultMod4 = (year % 4 == 0);
        this.resultMod100 = (year % 100 == 0);
        this.resultMod400 = (year % 400 == 0);
        return ((this.resultMod4 && !this.resultMod100) || this.resultMod400);
    }

}
