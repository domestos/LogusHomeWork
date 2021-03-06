
import java.util.*;

public class Rada {

    private Rada() {
    }

    private final int errorCount = 3;

    private int error = errorCount;

    private static Rada instance;

    public static Rada getInstance() {

        if (instance == null) {
            return instance = new Rada();
        }

        return instance;
    }

    private Map<Integer, Fraction> fractions = new HashMap<>();



    public void addFraction() {
        System.out.println("entered name fraction");
        String nameFraction = CheckValue.scanString();
        if (CheckValue.checkString(nameFraction)) {
            Fraction fraction = new Fraction(nameFraction);
            putInFractions(fraction);
        } else {
            System.out.println("Sorry! but fraction name cannot be empty. i think you very stupid if  can't give name fraction. bye...");
        }

    }

    private boolean checkEqualsFraction(Fraction fraction) {
        for (Fraction f : fractions.values()) {
            if (f.equals(fraction)) {
                return false;
            }
        }
        return true;
    }

    private void putInFractions(Fraction fraction) {
        if (fraction != null) {
            if (fractions.isEmpty()) {
                fractions.put(fraction.getId(), fraction);
            } else {
                if (checkEqualsFraction(fraction)) {
                    fractions.put(fraction.getId(), fraction);
                } else {
                    System.out.println("this name: " + fraction.getNameFraction() + " is exist. give another name");
                    addFraction();
                }
            }
        } else {
            System.out.println("I can't add this fraction...");
        }


    }


    public void printFractions() {
        Iterator iterator = fractions.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            Fraction value = fractions.get(key);

            System.out.println(key + " : " + value.getNameFraction());
        }

    }

    private int scanInt() {
        Scanner scanner;
        int error = 3;
        while (true) {
            scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                if (error <= 0) {
                    System.out.println("bay...!");
                    break;
                } else {
                    System.out.println("you entered incorrect value. Tray again ...");
                    error--;
                }
            }
        }
        return 0;
    }

    public void deleFraction() {
        if (!fractions.isEmpty()) {
            System.out.println("0 : || EXIT || ");
            printFractions();
            System.out.println("select fraction what a you want remove");
            int select = scanInt();
            if (select != 0) {
                if (fractions.containsKey(select)) {
                    fractions.remove(select);
                } else {
                    System.out.println("not founded...");
                    String message = "Bye...";
                    if (CheckValue.checkError(message)) {
                        deleFraction();
                    }
                }
            }
        }else{
            System.out.println("Fractions not founded...");
        }
    }
}




