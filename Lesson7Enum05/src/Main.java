import java.util.Scanner;

/**
 * Created by v.pelenskyi on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        String word = scanerWord(scanner);

        if(word != null && !word.isEmpty()){
            chcakPolindrom(word);
        }else{
            System.out.println("word can't be empty");
        }


    }

    private static void chcakPolindrom(String word) {

            char[] chars = word.toCharArray();
            int size =  chars.length;
        if(size>=5){
            for (int i = 0; i < size/2; i++) {
                char first =chars[i];
                char last =chars[(size-1) -i];
                if(first == last){
                    System.out.println(first + " = "+ last);
                }
                 System.out.println( chars[i]);
            }
        }else{
            System.out.println("word cannot be less 5 chars");
        }

    }

    private static String scanerWord( Scanner scanner) {
        scanner= new Scanner(System.in);
        return scanner.nextLine();

    }

}
