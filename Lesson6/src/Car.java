/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public class Car {

    private Wheel wheel;

    private SteeringWheel steeringWheel;

    private Body body;


    public Car(Wheel wheel, SteeringWheel steeringWheel, Body body) {
        this.wheel = wheel;
        this.steeringWheel = steeringWheel;
        this.body = body;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void reduceWheel(){
       wheel.setRadius(wheel.getRadius()/2);
    }

    public void changedStreeringWhellType(StreeringWheelType type){
        getSteeringWheel().setType(type);
    }




    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", steeringWheel=" + steeringWheel +
                ", body=" + body +
                '}';
    }




}
