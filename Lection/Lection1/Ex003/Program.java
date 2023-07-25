package Lection1.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D x = new Point2D(1, 6);
        Point2D y = new Point2D(8);
        x.setX(8);
        System.out.println(x.getX()); 
        System.out.println(x.distance(x, y)); 
    }
}
