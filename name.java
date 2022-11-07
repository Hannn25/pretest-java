import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter First Name:");
    System.out.println("Enter Last Name:");
    System.out.println("Enter Birth Place:");
    System.out.println("Enter Birth Year:");
    System.out.println("Enter Program Favourite Language:");

    // String input
    String firstName = myObj.nextLine();
    String lastName = myObj.nextLine();
    String birthPlace = myObj.nextLine();
    String birthYear = myObj.nextLine();
    String progLangFav= myObj.nextLine();
    myObj.close();

    // Output input by user
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Birth Place: " + birthPlace);
    System.out.println("Birth Year: " + birthYear);
    System.out.println("Program Favourite Language: " + progLangFav);
    
  }
}