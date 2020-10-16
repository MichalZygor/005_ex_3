import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int yearCommandLine;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        yearCommandLine = scanner.nextInt();
        YearCheck yearCheck = new YearCheck();
        System.out.println("Czy " + yearCommandLine + " jest rokiem przestępnym? " + yearCheck.isLeap(yearCommandLine));
    }
}
