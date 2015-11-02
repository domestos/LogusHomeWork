import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = null;

    //    question3(scanner);
    //    question4(scanner);

        questionV4_1(scanner);
    }

    private static void questionV4_1(Scanner scanner) {
       List<String> error = new ArrayList(2);

        String a = scannValue(scanner);
        String b = scannValue(scanner);
        error =  validationScan(a, error);
        error =  validationScan(b , error);
        if(error.isEmpty()){
            suma(a,b);
        }else {
            for (String s : error){
                System.out.println(s);
            }
        }

    }

    private static List<String> validationScan(String s, List<String> error) {
        try {
            Integer.valueOf(s);
        }catch (Exception e){
            error.add("This value "+s+" is not Integer!");

        }
        return error;
    }

    private static void suma(String a, String b) {
         try {
             System.out.println("Suma = " + (Integer.valueOf(b) + Integer.valueOf(a)) );
         }catch(Exception e){
             System.out.println("I not know, but something went wrong");
         }

    }


    private static String scannValue(Scanner scanner) {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void question4(Scanner scanner) {


        String [] error = new String[2];
        int a = 0, b=0;

        try{
            scanner = new Scanner(System.in);
            a=scanner.nextInt();
        }catch ( Exception e){
            error[0] = "This value a ->  incorrect";
        }

        try{
            scanner = new Scanner(System.in);
            b = scanner.nextInt();

        }catch ( Exception e){
            error[1] = "This value b -> incorrect"  ;
        }

        if(error[0] == null && error[1] == null ){
            System.out.println("Suma = "+(a+b));
        }else{
            for(String s : error){
                if(s!=null){
                System.out.println(s);
                }
            }
        }
    }

    private static void question3(Scanner scanner) {
        scanner  =  new Scanner(System.in);
        try {
            int i = scanner.nextInt();if(i%2 == 0 ){
                System.out.println("This value -> \""+i+"\" is a EVEN ");
            }else{
                System.out.println("This value -> \""+i+ "\" is a  is a ODD ");
            }

        }catch (InputMismatchException e){
            System.out.println("this values is not Integer");
        }



    }


}
