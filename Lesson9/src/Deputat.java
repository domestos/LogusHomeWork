import java.util.Scanner;

/**
 * Created by v.pelenskyi on 05.11.2015.
 */
public class Deputat extends Person {



    private String firslName;

    private String surName;

    private boolean grafter;

    private double sizeBribe;

    public Deputat(){
        super();
    };

    public Deputat(double weight, double growth, String firslName, String surName, boolean grafter) {
        super(weight, growth);
        this.firslName = firslName;
        this.surName = surName;
        this.grafter = grafter;
        chakDeputat();
    }


    public String getFirslName() {
        return firslName;
    }

    public void setFirslName(String firslName) {
        this.firslName = firslName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public boolean getGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public double getsizeBribe() {
        return sizeBribe;
    }

    public void setsizeBribe(double sizeBribe) {
        this.sizeBribe = sizeBribe;
    }


    public void chakDeputat(){
        if(grafter == false){
            System.out.println("this deputat clear");
        }else{
            System.out.println("Please give me bribe");
            Scanner scanner = new Scanner(System.in);
            giveMeBribe(scanner.nextDouble());
        }
    }

    public void giveMeBribe(double bribe){
            if(bribe>5000){
                 System.out.println("Deputat "+firslName+" say - me gave bribe "+ bribe+"$ and after me arrested ");
            }else{
                sizeBribe = bribe;
                System.out.println("i am a cool diputat, i has "+sizeBribe+"$");
            }
    }


    @Override
    public String toString() {
        return "Deputat{" +
                "firslName='" + firslName + '\'' +
                ", surName='" + surName + '\'' +
                ", grafter=" + grafter +
                ", sizeBribe=" + sizeBribe +
                '}';
    }
}
