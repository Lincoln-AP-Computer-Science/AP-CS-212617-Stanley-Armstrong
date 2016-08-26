import java.util.Scanner;

public class PP_1_2{
   void letter(){
   Scanner i = new Scanner(System.in);
   System.out.println("Who are you mailing?");
   String v = i.next();
   System.out.println("What is your name?");
   String l = i.next();
   System.out.println("Dear " + v + ",");
   System.out.println("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
   System.out.println("      bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
   System.out.println("      cccccccccccccccccccccccccccccccccc");
   System.out.println("      These are my musical notes.");
   System.out.println("Sincerely, " + l);
  
   }
   public static void main(String[] args){
      PP_1_2 p = new PP_1_2();
      p.letter();
      
      }
   }
   