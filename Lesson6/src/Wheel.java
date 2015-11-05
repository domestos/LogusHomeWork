/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public class Wheel {

    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void enlargeRadiusWheel(){
       radius= radius*2;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}
