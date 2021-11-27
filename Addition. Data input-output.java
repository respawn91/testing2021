// Вывод println()

public class HelloWorld{

     public static void main(String []args){
        
        System.out.println("Hello World");
        
        String s = "Test";
        System.out.println(s);
        
        int a = 10;
        System.out.println(a);
        
        boolean b = true;
        System.out.println(b);
        
        int x = 10;
        int y = 20;
        
        System.out.println(x+y);
        
        System.out.println(s + a);
        
     }
}

// Вывод print()

public class HelloWorld{

     public static void main(String []args){
        
        System.out.print("Hello World\n");
        System.out.print("Hello World\t");
        System.out.print("Hello World");
        
     }
}

// Вывод printf()

public class HelloWorld{

     public static void main(String []args){
        
        int a = 35;
        int b = 42;
        
        System.out.printf("%d + %d = %d\n", a, b, a + b);
     }
}


// Ввод данных

import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        System.out.println(x1);
        
        int x2 = sc.nextInt();
        System.out.println(x2);

        int x3 = sc.nextInt();
        System.out.println(x3);
        
        int x4 = sc.nextInt();
        System.out.println(x4);
     }
}
