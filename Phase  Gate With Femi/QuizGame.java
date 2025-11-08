import java.util.Scanner;

public class QuizGame {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int sumScore = 0;

System.out.println(" The capital of France is? ");
System.out.println("   (a) London (b) Rome (c) Paris (d) Monaco" );
     
     String pick = input.nextLine();

     if (pick.equals("c")) {
        System.out.println("Excellent");
        sumScore++;
      }

     else if (pick.equals("a") || pick.equals("b") || pick.equals("d")) {
       System.out.println("wrong");
     }
       else {
     System.out.println("invalid input");
     }

System.out.println("   Who is the president of nigeria? ");
System.out.println("       (a) Barack Obama (b) Vladmir Putin (c) Bola Ahmed Tinubu (d) Donald Trump" );
     
     String choose = input.nextLine();

     if (choose.equals("c")) {
     System.out.println("Excellent");
     sumScore++;
     }

     else if (choose.equals("a") || choose.equals("b") || choose.equals("d")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }

System.out.println("   Who the most troublesome in cohort 27 ? ");
System.out.println("        (a) Stanley (b) Nissi (c) Nelson (d) Fatia ");
     
     String type = input.nextLine();

     if (type.equals("c")) {
      System.out.println("Excellent");
      sumScore++;
     }

     else if (type.equals("a") || type.equals("b") || type.equals("d")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }
     
 System.out.println("Sum Score:  "  +  sumScore++);

 }
}