import java.awt.*;

/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public enum StreeringWheelType {

    LEATHER,
    PLASTIC,
    COLOR (Color.BLACK, Color.BLUE);


    StreeringWheelType() {
    }

    StreeringWheelType(Color black, Color blue) {

    }
}
