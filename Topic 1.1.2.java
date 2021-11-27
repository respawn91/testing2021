//

public class HelloWorld{

     public static void main(String []args){
        
        int a = 10;
        int b = 20;
        int c = a + b;
        
        System.out.println(c);
        
     }
}

// 

public class HelloWorld{

     public static void main(String []args){
        
        double a = 10;
        double b = 20;
        double c = a + b;
        
        System.out.println(c);
        
        String s = "Hello World";
        
        System.out.println(s);
        
     }
}

//

public class HelloWorld{

     public static void main(String []args){

    boolean b = true;
    
    System.out.println(b);
        
     }
}

// С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?  А месяцев?

public class HelloWorld{

    public static void main(String []args){

    int days = 234;
    
    int weeks = days / 7;
    
    int months = days / 30;
    
    System.out.println("Weeks = " + weeks);
    System.out.println("Months = " + months);
    
    }
}

/*
Дано двузначное число 39. Найти:
    число десятков в нем;
    число единиц в нем;
    сумму его цифр;
    произведение его цифр.
*/

public class HelloWorld{

    public static void main(String []args){

    int number = 39;
    
    int d = number / 10;
    int e = number % 10;
    
    System.out.println(d);
    System.out.println(e);
    
    }
}

// Разложение трехзначного числа

public class HelloWorld{

    public static void main(String []args){

    int number = 456;
    
    int s = number / 100;
    int d = number % 100 / 10;
    int e = number % 10;
    
    System.out.println(s);
    System.out.println(d);
    System.out.println(e);
    
    }
}

// Нахождение квадратного корня

public class HelloWorld{

    public static void main(String []args){

    int d = 16;
    
    double sqrt = Math.sqrt(d);
    
    System.out.println(sqrt);
    
    }
}

// 

public class HelloWorld{

    public static void main(String []args){

    int a = 10;
    int b = 10;
    
    boolean c = (a > b);
    
    System.out.println(c);
    
    }
}

// 

public class HelloWorld{

    public static void main(String []args){

    int a = 100;
    int b = 20;
    
    if(a > b) 
    {
        System.out.println("a is bigger");
    }
    else
    {
        System.out.println("b is bigger");
    }
    
    }
}

//

public class HelloWorld{

    public static void main(String []args){

    int a = 100;
    int b = 100;
    
    if(b > a) 
    {
        System.out.println("Mnogo");
    }
    else
        if(b < a)
        {
            System.out.println("Malo");
        }
        else
        {
            System.out.println("Ugadali");
        }
    }
}

// Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине.

public class HelloWorld{

    public static void main(String []args){

    int a = -30;
    int b = -40;
    
    if(Math.abs(a) > Math.abs(b))
    {
        a = a / 2;
    }
    
    System.out.println(a);
}
}