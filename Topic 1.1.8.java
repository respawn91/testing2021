//
public class HelloWorld{

     public static void main(String []args){
        
        int[] array = new int[5];
        
        try
        {
            array[0] = 4;
            array[2] = 10;
            array[3] = 6;
            array[5] = 4;    
        }
        
        catch(Exception e)
        {
            System.out.println("There is the Exception!");
        }
        
        finally
        {
            System.out.println("This is the finally area!");
        }
        
        System.out.println("The End");
        
     }
}

// https://javarush.ru/groups/posts/1944-iskljuchenija-checked-unchecked-i-svoi-sobstvennihe

public class HelloWorld{

     public static void main(String []args){
        
        int[] array = new int[5];
        
        try
        {
            array[0] = 4;
            array[2] = 10;
            array[3] = 6;
            array[5] = 10;
            
            int a = 10;
            int b = a / 0;
        }

        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("ArrayIndexOutOfBoundsException!");
        }
        
        catch(ArithmeticException exc)
        {
            System.out.println("ArithmeticException!");
        }        
        
        catch(Exception e)
        {
            System.out.println("Exception!");
        }
        
        
        finally
        {
            System.out.println("This is the finally area!");
        }
        
        System.out.println("The End");
        
     }
}

// StackTrace

public class HelloWorld{

     public static void main(String []args){
        
        int[] array = new int[5];
        
        try
        {
            array[0] = 4;
            array[2] = 10;
            array[3] = 6;
            array[5] = 10;
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        finally
        {
            System.out.println("This is the finally area!");
        }
        
        System.out.println("The End");
        
     }
}

// https://codeboard.io/projects/295050 - базовый проект для Unit-тестов

// https://codeboard.io/projects/295066 - основной проект для Unit-тестов
