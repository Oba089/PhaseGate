import java.util.Scanner;

public class LibraryTrackerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] books = {" The Holy Bible", "A Tale of Two Cities", "The Lord of the Rings", "Quotes of Wise Men", "The Hobbit" };
        boolean[] borrowed = new boolean[books.length];

        int choice;

        while (choice != 4) {
            System.out.println("\n      Library Book Tracker      ");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewBooks(books, viewed);
                    break;
                case 2:
                    borrowBook(books, borrowed, input);
                    break;
                case 3:
                    returnBook(books, borrowed, input);
                    break;
                case 4:
                    System.out.println("\n  Exiting Library Book Tracker. Goodbye!");
                    break;
                default:
                    System.out.println("\n  Invalid choice. Please select 1-4.");
            }
        } ;

    }
}
   