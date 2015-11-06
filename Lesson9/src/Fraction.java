import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class  Fraction {

    private  List<Deputat> fracia = new ArrayList();
   private int attempts = 3;

    public List<Deputat> getFracia() {
        return fracia;
    }

    public void setFracia(List<Deputat> fracia) {
        this.fracia = fracia;
    }

    public void addDeputat(){
           fracia.add(creatDeputat());
       }

    public void printGrafter(){
        System.out.println("Print grafter");
        List<Deputat> list = new ArrayList<>();
        for (Deputat deputat : fracia){
            if(deputat.getGrafter() == true){
                list.add(deputat);
            }
        }
        System.out.println(list.toString());


    }

    public void deleteDeputat(){
        System.out.println("whose are you want remove deputat?");
        System.out.println("************** \n* EXIT :-> 0 * \n**************\n");
        printAllDeputat();
        while (true) {
            if (!fracia.isEmpty()) {
                int scan = scanInt();
                if(scan == 0){break;}
                if (scan >= -1 && scan <= fracia.size()) {
                    fracia.remove(scan - 1);
                    System.out.println("successfully");
                    printAllDeputat();
                } else {
                    System.out.println("you write incorrect value");
                }
            }else {break;}

        }


    }

    private Deputat creatDeputat(){
        System.out.println("if you wont state Diputatom you must fill this");
        System.out.println("what are your weight");
        double weight  = scanDouble();
        System.out.println("what are your growth");
        double growth = scanDouble();
        System.out.println("what are your FiresName");
        String firstName =  scanString();
        System.out.println("what are your SurName");
        String surName = scanString();
        System.out.println("Are you like money ?  \n yes   || no ");
        String answer =  scanString();
        boolean grafter = false;
        if(answer.equalsIgnoreCase("yes")){
            grafter =true;
        }
        if(answer.equalsIgnoreCase("no")){
            grafter = false;
        }
        if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
            System.out.println("give full answer!  yes or no");
            String answer1 =  scanString();
            if(answer1.equalsIgnoreCase("yes")){
                grafter = true;
            }
            if(answer1.equalsIgnoreCase("no")){
                grafter = false;
            }
        }
        Deputat deputat = new Deputat(weight, growth, firstName,surName,grafter);
        System.out.println(deputat.toString());
        return  deputat;
    }

    private void printAllDeputat(){
        if(!fracia.isEmpty()){


            for (int i = 0; fracia.size()>i ; i++ ){
                Deputat d = fracia.get(i);
                System.out.println("id: "+(1+i)+ " "+d.getFirslName()+" "+d.getSurName());
            }
        }
    }

    private double scanDouble() {

        while (true) {
            try {
                return  new Scanner(System.in).nextDouble();
            } catch (Exception e) {
                System.out.println("you send incorrect value! tray again! you have attempts: "+ attempts);
                if (attempts > 0){attempts--;}else {
                    System.out.println("this deputat very stupid...ok Next question...");
                    break;
                }
            }
        }
        return 0;
    }

    private int scanInt() {
        while (true) {
            try {
                return  new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("you send incorrect value! tray again! you have attempts: "+ attempts);
                if (attempts > 0){attempts--;}else {
                    System.out.println("this deputat very stupid...ok Next question...");
                    break;
                }
            }
        }
        return -1;
    }

    private String scanString(){
        while (true) {
            try {
                return  new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.out.println("you send incorrect value! tray again! you have attempts: "+ attempts);
                if (attempts > 0){attempts--;}else {
                    System.out.println("this deputat very stupid...ok Next question...");
                    break;
                }
            }
        }
        return null;
    }


    }
