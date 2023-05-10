// Shapes
public class Shapes5 {

    public static void main(String[] args) {
        System.out.println(Rectangle5.getCount() + 
                " rectangles were created");
        
        Rectangle5 r1 = new Rectangle5(8.0, 5.0);
        System.out.println("r1 Area = " + r1.area());
        
        Rectangle5 r2 = new Rectangle5(3.0, 3.0);
        System.out.println("r2 Area = " + r2.area());
        
        Rectangle5 r3 = new Rectangle5(1.0, 7.0);
        System.out.println("r3 rea = " + r3.area());

        Circle5 c1 = new Circle5(3.0);
        System.out.println("c1 Area = " + c1.area());
        
        System.out.println(Rectangle5.getCount() + 
                " rectangles were created");

        System.out.println(Circle5.getCount() + 
                " circles were created");
    }

}