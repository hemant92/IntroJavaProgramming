package ChapterOne;

public class Table {
   public static void main(String[] args) {
       int numberOfRows = 5;
       System.out.println("a" + " " + "a^2" + " " + "a^3");
       for(int i = 1; i<numberOfRows; i++){
           System.out.println(i + " " + (i * i) + " " + (i * i * i));
       }
   } 
}