import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by v.pelenskyi on 29.10.2015.
 */
public class Main {

    public static void main(String[] args) {
        infoMonth();
    }




    private static void infoMonth() {
        String month = inScanMonth();
        while (true) {
            if (!month.isEmpty()) {
                Months mo = validationMonth(month);
                if (mo != null) {
                    printMontsSeason(mo);
                    printEqualsDay(mo);
                    printLissDay(mo);
                    printMoreDay(mo);
                    printNextSeanon(mo);
                    printPrevSeanon(mo);
                    printOddDay();
                    printOddDayThisMonyh(mo);

                    break;
                }
            }
            System.out.println("you entered incorrect month");
            month = inScanMonth();
        }
    }

    private static void printOddDayThisMonyh(Months mo) {
        if (mo.getDay()%2 ==0){
            System.out.println("this month "+mo+" has " +mo.getDay()+" days ");
        }
    }

    private static void printOddDay() {
        Months[] arraySeason = Months.values();
        for (Months mo : arraySeason){
           if (mo.getDay()%2 != 0){
               System.out.println("month "+ mo+ " has odd days " + mo.getDay());
            }


        }

    }

    private static void printPrevSeanon(Months mo) {
        Season season = mo.getSeason();
        Season [] arraySeason = Season.values();
        int size = arraySeason.length;
        for (int i = 0; i <size ; i++) {
            if(arraySeason[i] == season){
                int prevI = arraySeason[i].ordinal() -1;
                if(prevI>0){
                System.out.println(arraySeason[prevI]);
                }else {
                System.out.println(arraySeason[size-1]);

                }
            }
        }

    }

    private static void printNextSeanon(Months mo) {
        Season season = mo.getSeason();
        Iterator seasons = Arrays.asList(Season.values()).iterator();
        while (seasons.hasNext()) {
            if (season == seasons.next()) {
                if (seasons.hasNext()) {
                    System.out.println(season + " the next month: " + seasons.next());
                } else {
                    System.out.println(season + " the next month: " + "WINTER");
                }
            }
        }
    }

    private static void printMoreDay(Months mo) {
        Months[] monthses = Months.values();
        for (Months s : monthses) {
            if (s.getDay() > mo.getDay()) {
                System.out.println(s.getSeason() + ": " + s + " less days in month: " + s.getDay());
            }
        }
    }

    private static void printLissDay(Months mo) {
        Months[] monthses = Months.values();
        for (Months s : monthses) {
            if (s.getDay() < mo.getDay()) {
                System.out.println(s.getSeason() + ": " + s + " less days in month: " + s.getDay());
            }
        }
    }

    private static void printEqualsDay(Months mo) {
        Months[] monthses = Months.values();
        for (Months s : monthses) {
            if (s.getDay() == mo.getDay()) {
                System.out.println(s.getSeason() + ": " + s + " days: " + s.getDay());
            }
        }
    }

    private static void printMontsSeason(Months mo) {
        Months[] monthses = Months.values();
        for (Months s : monthses) {
            if (s.getSeason() == mo.getSeason()) {
                System.out.println(s.getSeason() + ": " + s);
            }
        }
    }


    private static Months validationMonth(String month) {
        Months[] monthses = Months.values();
        for (Months s : monthses) {
            if (s.name().compareToIgnoreCase(month) == 0) {
                return s;
            }
        }
        return null;
    }

    private static String inScanMonth() {
        Scanner scanLine = new Scanner(System.in);
        String month = scanLine.nextLine();
        return month;
    }







}
