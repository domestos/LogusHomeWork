/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public class SteeringWheel {
   private int radius;
   private StreeringWheelType type;

    public SteeringWheel(int radius, StreeringWheelType type) {
        this.radius = radius;
        this.type = type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public StreeringWheelType getType() {
        return type;
    }

    public void setType(StreeringWheelType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "radius=" + radius +
                ", type=" + type +
                '}';
    }
}
