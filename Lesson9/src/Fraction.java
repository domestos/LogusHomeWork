import java.util.Scanner;

/**
 * Created by v.pelenskyi on 05.11.2015.
 */
public  class  Fraction {

    public static void addDeputat(){
        Scanner scanner = null;
        System.out.println("if you wont state Diputatom you must fill this");
        Deputat deputat = new Deputat();

        System.out.println("what are your weight");
        scanner = new Scanner(System.in);
        deputat.setWeight(scanner.nextDouble());

        System.out.println("what are your growth");
        scanner = new Scanner(System.in);
        deputat.setGrowth(scanner.nextDouble());

        System.out.println("what are your FiresName");
        scanner = new Scanner(System.in);
        deputat.setFirslName(scanner.nextLine());



        System.out.println(deputat.toString());
    }
}
