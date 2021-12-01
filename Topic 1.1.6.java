//

public class HelloWorld{

     public static void main(String []args){
        
        int[] numbers = new int[5];
        
        numbers[0] = 5;
        numbers[3] = 7;
        
        for(int i = 0; i < numbers.length; i++) 
        {
            System.out.print(numbers[i] + " ");
        }
        
     }
}

//

import java.util.Random;

public class HelloWorld{
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] generateArray(int n)
    {
        int[] array = new int[n];
        
        Random r = new Random();
        
        for(int j = 0; j < array.length; j++) 
        {
            array[j] = r.nextInt(100);
        }
        
        return array;
    }    

    public static void main(String []args){
        
        printArray(generateArray(10));
    
    }
}

/*
Дан массив. Все его элементы:
увеличить в 2 раза
уменьшить на число А
разделить на первый элемент
*/

import java.util.Random;

public class HelloWorld{
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static double[] generateArray(int n)
    {
        double[] array = new double[n];
        
        Random r = new Random();
        
        for(int j = 0; j < array.length; j++) 
        {
            array[j] = r.nextInt(100);
        }
        
        return array;
    }    
    
    public static double[] multiplyByTwo(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * 2;
        }
        
        return array;
    }
    
    public static double[] decreaseByA(double[] array, double a)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] - a;
        }
        
        return array;
    }

    public static double[] divideByFirstElement(double[] array)
    {
        double x = array[0];
        
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] / x;
        }
        
        return array;
    }
    
    public static void main(String []args){
        
        double[] array = generateArray(5);
        
        printArray(array);
        printArray(multiplyByTwo(array));
        printArray(decreaseByA(array, 20.0));
        printArray(divideByFirstElement(array));
        
        
    }
}

/*
Дан массив. Напечатать все неотрицательные элементы
*/

import java.util.Random;

public class HelloWorld{
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void printNonNegativeElements(double[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            if(array[i] >= 0)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String []args){
        
        double[] array = {1, 3, 5, -2, 0, 10, -5, 14, 10};
        
        printArray(array);
        printNonNegativeElements(array);
        
    }
}

/*
Дан массив. Определить: 
максимальный элемент
минимальный элемент 
на сколько максимальный элемент больше минимального 
индекс максимального элемента
индекс минимального элемента
*/

import java.util.Random;

public class HelloWorld{
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static double[] generateArray(int n)
    {
        double[] array = new double[n];
        
        Random r = new Random();
        
        for(int j = 0; j < array.length; j++) 
        {
            array[j] = r.nextInt(100);
        }
        
        return array;
    }      
    
    public static double findMaxElement(double[] array)
    {
        double max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        
        return max;
    }
    
    public static double findMinElement(double[] array)
    {
        double min = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static int findIndexOfMaxElement(double[] array)
    {
        int index = 0;
        
        double max = findMaxElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static int findIndexOfMinElement(double[] array)
    {
        int index = 0;
        
        double min = findMinElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == min)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    
    public static void main(String []args){
        
        double[] array = generateArray(10);
        printArray(array);
        
        System.out.println("Max element = " + findMaxElement(array) + " with index = " + findIndexOfMaxElement(array));
        
        System.out.println("Min element = " + findMinElement(array) + " with index = " + findIndexOfMinElement(array));
        
        
    
    }
}

/*
Дан массив. Поменять местами второй и пятый элементы; 
*/

import java.util.Random;

public class HelloWorld{
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static double[] generateArray(int n)
    {
        double[] array = new double[n];
        
        Random r = new Random();
        
        for(int j = 0; j < array.length; j++) 
        {
            array[j] = r.nextInt(100);
        }
        
        return array;
    }      
    
    public static double findMaxElement(double[] array)
    {
        double max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        
        return max;
    }
    
    public static double findMinElement(double[] array)
    {
        double min = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static int findIndexOfMaxElement(double[] array)
    {
        int index = 0;
        
        double max = findMaxElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static int findIndexOfMinElement(double[] array)
    {
        int index = 0;
        
        double min = findMinElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == min)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static double[] swapElements(double[] array, int n, int m)
    {
        if((n < array.length) && (m < array.length) && (n >= 0) && (m >= 0))
        {
            double temp = array[n];
            array[n] = array[m];
            array[m] = temp;
            
            return array;    
        }
        else
        {
            return array;
        }
    }
    
    public static void main(String []args){
        
        double[] array = generateArray(10);
        printArray(array);
        
        printArray(swapElements(array, 1, 7));
    
    }
}