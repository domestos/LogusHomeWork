/**
 * Created by v.pelenskyi on 04.11.2015.
 */
public class Body {

    private int widht;

    private int height;

    private String color;

    public Body(int widht, int height, String color) {
        this.widht = widht;
        this.height = height;
        this.color = color;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Body{" +
                "widht=" + widht +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
