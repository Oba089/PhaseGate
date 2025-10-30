import java.util.Scanner;

public class Cohort27Quiz {

     public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     int totalScore = 0;

System.out.println("Who is the favorite facilitator in Semicolon?");
System.out.print("  (A) Sir SK (B) Mr. femi (C) Sir Evans (D) Miss Kim  ");
     
     String pick = input.nextLine();

     if (pick.equals("B")) {
        System.out.println("Excellent");
        totalScore++;
      }

     else if (pick.equals("A") || pick.equals("C") || pick.equals("D")) {
       System.out.println("wrong");
     }
       else {
     System.out.println("invalid input");
     }

System.out.println("Who is the best all round cohort member in Cohort 27?");
System.out.print("  (A) Ekwe (B) Dotun (C) Oyinade (D) Eniife  ");
     
     String choose = input.nextLine();

     if (choose.equals("B")) {
     System.out.println("Excellent");
     totalScore++;
     }

     else if (choose.equals("A") || choose.equals("C") || choose.equals("D")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }

System.out.println("Who is the most sophisticated in Cohort 27");
System.out.print("  (A) Beny (B) Dotun (C) Nissi (D) Michael  ");
     
     String type = input.nextLine();

     if (type.equals("B")) {
      System.out.println("Excellent");
      totalScore++;
     }

     else if (type.equals("A") || type.equals("C") || type.equals("D")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }
     
 System.out.println("Total Score" + totalScore++);

 }
}