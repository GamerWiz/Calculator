import java.util.Scanner;
import java.text.DecimalFormat;

class calculator {
  public static void main(String[] args) {
    int x = 0;
    while(x == 0){
DecimalFormat trunc = new DecimalFormat("#.000");
  Scanner opin = new Scanner(System.in);
System.out.println("What operation would you like to do? [1] = +, [2]= -, [3] = *, [4] = /, [n] = exit");
  String originalOp = opin.nextLine();
  if (originalOp.equals("1")) {
    Scanner addIn1 = new Scanner(System.in);
      System.out.println("Enter the first number you want to add");
       while (!addIn1.hasNextInt()){
        System.out.println("Nice try Mr. V, but no error here. Type a number");
        addIn1.next();
      }
      int firstadd = addIn1.nextInt();
    Scanner addIn2 = new Scanner(System.in);
      System.out.println("Enter the second number you want to add");
         while (!addIn2.hasNextInt()){
        System.out.println("Don't even try me. Enter a number");
        addIn2.next();
      }
      int secondadd = addIn2.nextInt();
      int sum = firstadd + secondadd;
    System.out.println("Answer: " + sum);
    }
  else if (originalOp.equals("2")){
    Scanner subIn1 = new Scanner(System.in);
      System.out.println("Enter a number");
        while (!subIn1.hasNextInt()){
        System.out.println("Dude, quit trying. It ain't gonna crash. Enter a number");
        subIn1.next();
      }
      int firstsub = subIn1.nextInt();
    Scanner subIn2 = new Scanner(System.in);
      System.out.println("What number do you want to subtract by?");
       while (!subIn2.hasNextInt()){
        System.out.println("Why are you still doing this? Enter a number");
        subIn2.next();
      }
      int secondsub = subIn2.nextInt();
      int difference = firstsub - secondsub;
    System.out.println("Answer: " + difference);
  }
  else if (originalOp.equals("3")){
    Scanner multIn1 = new Scanner(System.in);
      System.out.println("Enter a number");
       while (!multIn1.hasNextInt()){
        System.out.println("Ok bud, enough games. I think we all know I'm invinvible. Enter a number");
        multIn1.next();
      }
      int firstmult = multIn1.nextInt();
    Scanner multIn2 = new Scanner(System.in);
      System.out.println("What number do you want to multiply by?");
       while (!multIn2.hasNextInt()){
        System.out.println("I'm gonna get real with you, this isn't funny anymore. Enter a number");
        multIn2.next();
      }
      int secondmult = multIn2.nextInt();
      int product = firstmult * secondmult;
    System.out.println("Answer: " + product);
  }
  else if (originalOp.equals("4")){
    Scanner divIn1 = new Scanner(System.in);
      System.out.println("Enter a number");
       while (!divIn1.hasNextInt()){
        System.out.println("Mr.V, Ammar made me invincible, I can't be defeated. Enter a number");
        divIn1.next();
      }
      int dividend = divIn1.nextInt();
    Scanner divIn2 = new Scanner(System.in);
      System.out.println("What number do you want to divide by?");
       while (!divIn2.hasNextInt()){
        System.out.println("Your efforts to crash me are futile. Enter a number");
        divIn2.next();
      }
      int divisor = divIn2.nextInt();
      double quotient = (double) dividend/divisor;
    System.out.println("Answer: " + trunc.format(quotient));
  }
  else if (originalOp.equals("n")){
    System.out.println("Yeah, that's right. Leave. Give up. I'm invincible");
    x++;
  }

  else {
    System.out.println("That's not an operation you bumbling buffoon, you crazy maniac.");
  }
  }
  }

  }
