// 

public class HelloWorld{

     public static void main(String []args){
        
        
        for(int i = 1; i <= 5; i++) 
        {
            System.out.println("Hello World");
        }
        
     }
}

//

public class HelloWorld{

     public static void main(String []args){
        
        
        for(int i = 1; i <= 10; i = i * 2) 
        {
            System.out.println(i);
        }
        
     }
}

/*
Напечатать числа следующим образом:
10 10.4
11 11.4
...
25 25.4

*/

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 10; i <= 25; i++) 
        {
            System.out.println(i + " " + i + ".4");
        }
     }
}

/*
Напечатать таблицу умножения на 7: 
1 х 7 = 7 
2 х 7 = 14 
... 
9 х 7 = 63 
*/

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 1; i <= 9; i++) 
        {
            System.out.println(i + " x 7 = " + i*7);
        }
     }
}

/*
Найти: 
- сумму всех целых чисел от 100 до 500; 
- сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
*/

public class HelloWorld{

     public static void main(String []args){
        
        int sum = 0;
        
        for(int i = 100; i <= 500; i++) 
        {
            System.out.println("---------------");
            System.out.println("i = " + i);
            System.out.println("old sum = " + sum);
            sum = sum + i;
            System.out.println("new sum = " + sum);
            System.out.println("---------------");
            System.out.println();
        }
        
        System.out.println(sum);
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 55;
        int b = 70;
        
        int sum = 0;
        
        if(a > b)
            System.out.println("Incorrect data");
        else
        {
            for(int i = a; i <= b; i++) 
            {
                sum = sum + i;
            }
            
            System.out.println(sum);    
            
        }
        
     }
}

// while; do while

public class HelloWorld{

     public static void main(String []args){
        
        int i = 10;
        
        while(i < 20)
        {
            System.out.println(i);
            i++;
        }
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int i = 10;
        
        do
        {
            System.out.println(i);
            i++;
        }
        
        while(i > 20);
        
     }
}

// Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39.

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 5000; i > 0; i--)
        {
            if(i % 39 == 0)
            {
                System.out.println(i);
                break;
            }
        }
     }
}

/*
Гражданин 1 марта открыл счет в банке, вложив 1000 руб. 
Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. 
Определить:
- за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
*/

public class HelloWorld{

     public static void main(String []args){
        
        double account = 1000;
        
        for(int i = 1; i <= 36; i++)
        {
            if(account * 0.02 >= 30)
            {
                System.out.println("Month = " + i);
                break;
            }
            else
            {
                account = account + account * 0.02;    
            }
        }
     }
}

