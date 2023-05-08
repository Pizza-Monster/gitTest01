// Rectangle Class
public class Rectangle5 {
    private double length = 0;
    private double width = 0;
    private static int count = 0;

    public Rectangle5(double length, 
        double width) {
        this.length = length;
        this.width = width;
        ++this.count;
    }
    
    public double area() {
        return(length * width);
    }    
    
    public static int getCount() {
        return count;
    }
}
