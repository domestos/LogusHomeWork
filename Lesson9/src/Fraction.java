import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Fraction implements Comparable<Fraction>  {

    private static  int count=1;

    private int id;

    private String nameFraction;

    private Set deputats = new LinkedHashSet();

    public Fraction(String nameFractio) {
        this.nameFraction = nameFractio;
        this.id = count++;
        this.deputats = deputats;
    }

    public Fraction() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set getDeputats() {
        return deputats;
    }

    public void setDeputats(Set deputats) {
        this.deputats = deputats;
    }

    public String getNameFraction() {
        return nameFraction;
    }

    public void setNameFraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public void addDeputat(){
        Deputat deputat = creatDeputat();
        deputats.add(deputat);
    }

    public Deputat creatDeputat() {
        System.out.println("what is your first name?");
        String fname = CheckValue.scanString();
        System.out.println("what is your surname?");
        String sname = CheckValue.scanString();
        System.out.println("how old are you?");
        int age = CheckValue.scanInt();
        Deputat deputat = new Deputat(fname, sname, age);
        return deputat;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        return !(nameFraction != null ? !nameFraction.equals(fraction.nameFraction) : fraction.nameFraction != null);

    }

    @Override
    public int hashCode() {
        return nameFraction != null ? nameFraction.hashCode() : 0;
    }

    @Override
    public int compareTo(Fraction o) {
        return this.getNameFraction().compareToIgnoreCase(o.getNameFraction());
    }



}
