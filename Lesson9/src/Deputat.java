import java.util.Scanner;

public class Deputat extends Person {
    private boolean grafter;

    private double sizeBribe;

    public Deputat(String fname, String sname, int age) {
        super(fname, sname, age);
        this.grafter = checkGrafter();
        this.sizeBribe = giveBribe();
    }

    private boolean checkGrafter() {
       while (true){
           String answer = CheckValue.scanString();
           if(CheckValue.checkString(answer)){
               if(answer.compareToIgnoreCase("yes") == 0){return true;}
               if(answer.compareToIgnoreCase("no") == 0){return false;}else{

               }

           }
           return false;
       }
    }

    private double giveBribe() {
        if(grafter){return scanDouble();}
        return 0;
    }

    private double scanDouble() {
        Scanner scanner = new Scanner(System.in);
        while (true){

            try{
                return scanner.nextDouble();
            }catch (Exception e){
               String message =  "you entered incorrect value";
                if(!CheckValue.checkError(message)){break;}
            }
        }

        return 0;
    }

}
