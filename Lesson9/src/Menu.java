import java.util.Scanner;

public class Menu {

    Rada rada = Rada.getInstance();

    private int scanValue() {
        Scanner scanner;
        int error = 3;
        while (true) {
            scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                if (error <=0) {
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

    private void showRadaMenu() {
        System.out.println(" MENU \n" +
                        " 0 : || EXIT || \n" +
                        " 1 : add new Fraction \n" +
                        " 2 : delete Fraction  \n" +
                        " 3 : show all fractions \n"
        );
    }

    private void doRadaMenu(int i) {
        switch (i) {
            case 0:
                 break;
            case 1:
                rada.addFraction();
                break;
            case 2:
                rada.deleFraction();
                break;
            case 3:
                rada.printFractions();
                break;
        }
    }

    public void radaMenu(){
        showRadaMenu();
        int choce = scanValue();
        while (0 != choce){
            doRadaMenu(choce);
            showRadaMenu();
            choce = scanValue();
        }
    }

    private void showFractionMenu() {

    }

}
