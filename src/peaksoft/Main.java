package peaksoft;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String week = scanner.nextLine();
        try {
            System.out.println(DaysOfTheWeek.valueOf(week.toUpperCase(Locale.ROOT)));
        }catch (IllegalArgumentException a){
            System.out.println("сен туура эмес жаздын: "+week);
        }


    }
}
