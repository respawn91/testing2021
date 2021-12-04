// Ссылка на проект с очередью: https://codeboard.io/projects/294054

// Работа с arrayList

import java.util.ArrayList;

public class HelloWorld{

     public static void printArrayList(ArrayList<String> arrayList)
     {
         for(int i = 0; i < arrayList.size(); i++)
         {
             String value = arrayList.get(i);
             System.out.print(value + "  ");
         }
         System.out.println();
     }

     public static void printArraySize(ArrayList<String> arrayList)
     {
        System.out.println("Size of the arrayList is " + arrayList.size()); 
     }
     
     public static void main(String []args){
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        printArrayList(arrayList);
        arrayList.add("Anton");
        printArrayList(arrayList);
        arrayList.add("Mikhail");
        printArrayList(arrayList);
        arrayList.add("Anna");
        printArrayList(arrayList);
        arrayList.add("Mikhail");
        printArrayList(arrayList);
        
        arrayList.add(0,"Kate");
        printArrayList(arrayList);
        
        arrayList.add(2,"Daria");
        printArrayList(arrayList);
        
        arrayList.remove(0);
        printArrayList(arrayList);
        
        arrayList.remove("Mikhail");
        printArrayList(arrayList);
        
        arrayList.remove("Mikhail");
        printArrayList(arrayList);
     }
}

// Ссылка на работу с arrayList и linkedList: https://javarush.ru/groups/posts/dinamicheskie-massivy-java