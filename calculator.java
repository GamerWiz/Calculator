import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator {

  static int add(int a, int b){
    return a + b;
  }
  static int subtract(int a, int b){
    return a - b;
  }
  static int multiply(int a, int b){
    return a * b;
  }
  static int divide(int a, int b){
    return a / b;
  }
  public static void main(String[] args) {
    DecimalFormat trunc = new DecimalFormat("#.000");
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
      System.out.println(add(A1, A2));
      break;
    case "2":
      System.out.println("What numbers do you want to subtract?");
      Scanner subIn1 = new Scanner(System.in);
      int S1 = subIn1.nextInt();
      Scanner subIn2 = new Scanner(System.in);
      int S2 = subIn2.nextInt();
      System.out.println(subtract(S1, S2));
      break;
    case "3":
    System.out.println("What numbers do you want to muliply?");
    Scanner multIn1 = new Scanner(System.in);
    int M1 = multIn1.nextInt();
    Scanner multIn2 = new Scanner(System.in);
    int M2 = multIn2.nextInt();
    System.out.println(multiply(M1, M2));
    case "4":
    System.out.println("What numbers do you want to divide?");
    Scanner divIn1 = new Scanner(System.in);
    int D1 = divIn1.nextInt();
    Scanner divIn2 = new Scanner(System.in);
    int D2 = divIn2.nextInt();
    double quotient = (double) divide(D1, D2);
    System.out.println(trunc.format(quotient));
    }
  }
}
