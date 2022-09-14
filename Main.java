import java.text.DecimalFormat;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   //Finding the volume
    double volume;
    Scanner scanner = new Scanner (System.in);
    /*System.out.println("Please enter the length of your box");
    double length = (double)scanner.nextDouble();
    System.out.println("\nThe length of your box is " + length);

    System.out.println("What is the width of your box?");
    double width = (double)scanner.nextDouble();
    System.out.println("The width of your box is " + width);

    System.out.println("What is the height of your box");
    double height = (double)scanner.nextDouble();
    System.out.println("The height of your box is " + height);

    volume = length * width * height;
    System.out.println(" The volume of your box is " + volume + "!");


    //What year the user will be by the end of 2022
final int CURRENT_YEAR = 2022;
int newAge;
    System.out.println("What year were you born?");
  int yourAge = scanner.nextInt();
    newAge= CURRENT_YEAR - yourAge;
    System.out.println("You will be " + newAge +" at the begning of the new year!");


    //School average counter
    double average;
    System.out.println("What is your name? ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name +" I would like to know your average in your classes. Please enter the first course average that you have");
    double firstMark = (double) scanner.nextDouble();
    System.out.println("What is the mark for your second class please?");
    double secondMark = (double) scanner.nextDouble();
    System.out.println("What is the mark of your third class please?");
    double thirdMark = (double) scanner.nextDouble();
    System.out.println("What is the mark of your fourth class please?");
    double fourthMark = (double) scanner.nextDouble();

    average = (firstMark + secondMark + thirdMark + fourthMark) / 4;
    
    System.out.println("Therefore, your average is");
     DecimalFormat f = new DecimalFormat("0.00");
     System.out.print(f.format(average));
    

    
  }
}