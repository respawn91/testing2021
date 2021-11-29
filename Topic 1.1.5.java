// Треугольник

public class HelloWorld{

    public static double perimetr(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
            return a + b + c;
        else 
            return 0;
    }
    
    public static double square(double a, double b, double c)
    {
        double p = perimetr(a, b, c) / 2;
        
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return s;
    }
    
    public static boolean isTriangle(double a, double b, double c)
    {
        boolean isTriangle;
        
        if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a))
            isTriangle = true;
        else
            isTriangle = false;
            
        return isTriangle;
    }

     public static void main(String []args){
        
        System.out.println(square(-2,-2,7));
     }
}


// https://codeboard.io/projects/247526

// https://codeboard.io/projects/291528

