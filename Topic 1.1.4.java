//

public class HelloWorld{

    public static int Max(int a, int b)
    {
        int max;
        
        if(a > b)
            max = a;
        else
            max = b;
            
        return max;
    }

    public static void main(String []args){
        
        int a = 11;
        int b = 33;
            
        int x = -24;
        int y = 145;
        
        int max1 = Max(a, b);
        int max2 = Max(x, y);
        
        System.out.println(max1);
        System.out.println(max2);
     }
}

/*
Напечатать числа в виде следующей таблицы:
5 5 5 5 5 5
5 5 5 5 5 5
5 5 5 5 5 5
5 5 5 5 5 5
*/

public class HelloWorld{

    public static void Print()
    {
        for(int i = 1; i <= 4; i++)
            {
                System.out.println("5 5 5 5 5 5");
            }
    }

    public static void main(String []args){
        
        Print();

     }
}

// Напечатать таблицу сложения

public class HelloWorld{

    public static void printElement(int i, int j)
    {
        System.out.print(i + " + " + j + " = " + (i + j) + "\t");
    }
    
    public static void printLine(int i) 
    {
        for(int j = 1; j <= 9; j++)
        {
            printElement(i,j);
        }
        System.out.println();
    }
    
    public static void printTable()
    {
        for(int i = 1; i <= 9; i++)
        {
            printLine(i);
        }
    }

    public static void main(String []args){
        
        printTable();

     }
}

/*
Реализовать функцию нахождения максимума:
Из трёх чисел
Из четырёх чисел
*/

public class HelloWorld{

    public static int maxOfTwo(int a, int b)
    {
        int max;
        
        if(a > b)
            max = a;
        else
            max = b;
            
        return max;
    }
    
    public static int maxOfThree(int a, int b, int c)
    {
        return maxOfTwo(maxOfTwo(a,b), c);
    }
    
    public static int maxOfFour(int a, int b, int c, int d)
    {
        return maxOfTwo(maxOfTwo(a,b),maxOfTwo(c,d));
    }

    public static void main(String []args){
        
        System.out.println(maxOfFour(1, 3, 5 ,9));
        System.out.println(maxOfFour(-1, -3, -5 ,-9));
        System.out.println(maxOfFour(0, 24 , 15 , 12));
     }
}

