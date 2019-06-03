import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator {

  static int addition(int a, int b){
    return a + b;
  }
  static int subtraction(int a, int b){
    return a - b;
  }
  public static void main(String[] args) {
    Scanner opin = new Scanner(System.in);
    System.out.println("What operation would you like to do? [1] = +, [2]= -, [3] = *, [4] = /, [n] = exit");
    String originalOp = opin.nextLine();
    switch(originalOp){
    case "1":
      System.out.println("What numbers do you want to add? (# #)");
      Scanner addIn1 = new Scanner(System.in);
      int A1 = addIn1.nextInt();
      Scanner addIn2 = new Scanner(System.in);
      int A2 = addIn2.nextInt();
      System.out.println(addition(A1, A2));
      break;
    case "2":
      System.out.println("What numbers do you want to subtract?");
      Scanner subIn1 = new Scanner(System.in);
      int S1 = subIn1.nextInt();
      Scanner subIn2 = new Scanner(System.in);
      int S2 = subIn2.nextInt();
      System.out.println(subtraction(S1, S2));
    case "3":
    case "4":
      }
    }
  }
