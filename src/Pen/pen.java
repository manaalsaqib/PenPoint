package Pen;
import Point.point;

public class pen {
    private String position;
    private String colour;

    public pen(String position, String colour) {
        this.position = position;
        this.colour = colour;
    }
    public void DisplayPen(){
        point p = new point(10,20);
        System.out.println("position of pen is " + position + "(" + p.getX() + "," + p.getY() + ")");
        System.out.println("Colour of pen is " + colour);

    }

}