import sun.org.mozilla.javascript.internal.xml.XMLLib;

import java.util.List;

/**
 * Created by v.pelenskyi on 05.11.2015.
 */
public class MainRada {
    public static void main(String[] args) {
       Deputat d = new Deputat(95, 195 , "Valera", "pelenskyi", true);

        Fraction fraction = new Fraction();
        fraction.addDeputat();
        fraction.addDeputat();
        fraction.addDeputat();
        fraction.deleteDeputat();
        fraction.printGrafter();

        List<Deputat> listFraction = fraction.getFracia();

        for(Deputat deputat : listFraction){
            System.out.println(deputat.toString());
        }

    }
}
