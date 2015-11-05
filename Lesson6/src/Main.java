/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public class Main {
    public static void main(String[] args) {

    Car car = new Car(new Wheel(20), new SteeringWheel(15,StreeringWheelType.LEATHER), new Body(120,120, "read"));

        System.out.println(car.toString());
        car.reduceWheel();
        car.changedStreeringWhellType(StreeringWheelType.PLASTIC);
        System.out.println(car.toString());





    }
}
