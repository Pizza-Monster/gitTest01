public class Circle5 {
    private double radius = 0;
    private static int count = 0;
    
    public Circle5(double radius) {
        this.radius = radius;
        ++this.count;
    }
    
    public double area() {
        return(Math.PI * Math.pow(this.radius, 2));
    }   

    public static int getCount() {
        return count;
    }
}
