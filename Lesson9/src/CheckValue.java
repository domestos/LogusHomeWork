import java.util.Scanner;

/**
 * Created by varenik on 11.11.15.
 */
public class CheckValue {

    private static final int errorCount =3;

    private static  int error = errorCount;

    static boolean checkError(String message) {
        if (error > 0) {
            System.out.println(message);
            error--;
            return true;
        } else {
            return false;
        }
    }


    static boolean checkString(String s) {
        if (s.isEmpty() || s == null) {
            return false;
        } else {
            return true;
        }
    }


    static String scanString() {
        String line = null;
        String message = "Line can't be empty.Tray again.";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                line = scanner.nextLine();
                if (CheckValue.checkString(line)) {
                    return line;
                } else {
                    if (!CheckValue.checkError(message)) {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("something wrong");
            }
        }
        return line;
    }





    static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                return scanner.nextInt();
            }catch (Exception e){
                String messege = "you entered incorrect value";
                if(CheckValue.checkError(messege)){break;}
            }
        }
        return 0;
    }



}
