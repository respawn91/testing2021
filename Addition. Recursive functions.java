// Факториал
public class HelloWorld{

    public static int fact1(int n) {
        int result = 1;
        
        if((n == 0) || (n == 1))
            result = 1;
        else {
            for(int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        
        return result;
    }
    
    public static int fact2(int n) {

        if((n == 0) || (n == 1))
            return 1;
        else
            return n*fact2(n-1);
    }
    

    public static void main(String []args){
        
        System.out.println(fact1(7));
        System.out.println(fact2(7));
    
    
    }
}


// Последовательность Фибоначчи
public class HelloWorld{

    public static int fibb(int n) {
        
        if((n == 1) || (n == 2))
            return 1;
        else
            return fibb(n-1) + fibb(n-2);
    }

    

    public static void main(String []args){
        
        System.out.println(fibb(7));
        
        for(int i = 1; i <= 10; i++) {
            
            System.out.print(fibb(i) + " ");
        }
    
    
    }
}