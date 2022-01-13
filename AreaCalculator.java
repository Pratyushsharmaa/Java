// calculate area of circle in method 1 
//calculate area of rectangle in method 2. 
// using method overloading

public class AreaCalculator {
    public static void main(String[] args) {                    //main to check result of code
        area(10);
        area(-10);
        area(5,5);
        area(5,-5);
        area(5.0);
    }

private static double area(double radius){
    if(radius<0) {
        System.out.println("Invalid value");
        return -1.0;
    }
    else{
        double areaOfCircle = 3.14 * radius * radius;
        System.out.println(" Area of circle with radius " + radius + " is " + areaOfCircle);
    }
    return radius;
}
private static double area(double x, double y){
    if(x<0 || y<0){
        System.out.println("Invalid value");
        return -1.0;
    }
    else{
       double areaOfRectangle = x * y;
        System.out.println("Area of rectangle with sides " + x + " and " + y + " is " + areaOfRectangle);
    }
    return x;
}
}
