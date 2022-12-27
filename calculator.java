import java.util.*;

class calculator {
    public static void main(String[] args) {
        int result = 0, first = 0, second = 0;
        Scanner rituraj = new Scanner(System.in);
        System.out.println("enter task to perform:");
        System.out.println("1 to do addition b/t two number");
        System.out.println("2 to do substraction b/t two number");
        System.out.println("3 to do multiplication b/t two number");
        System.out.println("4 to do division b/t two number");
        int ritu = rituraj.nextInt();
        switch (ritu) {
            case 1:

                System.out.println("Enter 1st number");
                first = rituraj.nextInt();
                System.out.println("Enter 2nd number");
                second = rituraj.nextInt();
                result = first + second;
                System.out.println("The result is " + result);
                break;

            case 2:

                System.out.println("Enter 1st number");
                first = rituraj.nextInt();
                System.out.println("Enter 2nd number");
                second = rituraj.nextInt();
                result = first - second;
                System.out.println("The result is " + result);
                break;

            case 3:

                System.out.println("Enter 1st number");
                first = rituraj.nextInt();
                System.out.println("Enter 2nd number");
                second = rituraj.nextInt();
                result = first * second;
                System.out.println("The result is " + result);
                break;

            case 4:

                System.out.println("Enter 1st number");
                first = rituraj.nextInt();
                System.out.println("Enter 2nd number");
                second = rituraj.nextInt();
                result = first / second;
                System.out.println("The result is " + result);
                break;

            default:

                System.out.println("Sorry looks like wrong input!");
                break;
        }
        rituraj.close();
    }
}
