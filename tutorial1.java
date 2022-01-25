import java.util.Scanner;

class tutorial1 {
  public static void main(String[] args) {
    // qns 2a
    System.out.println("Hello, I am Jing Jie!");
    // qns 2b
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter Module Code: ");
    String module = myObj.nextLine();
    switch (module) {
      case "CSC1006":
        System.out.println("Mathematics 2");
        break;
      case "CSC1007":
        System.out.println("Operating Systems");
        break;
      case "CSC1008":
        System.out.println("Data Structures and Algorithms");
        break;
      case "CSC1009":
        System.out.println("Object-Oriented Programming");
        break;
      case "CSC1010":
        System.out.println("Computer networks");
        break;
    }
    // qns 2c
    for (int i = 102; i > 65; i--) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}