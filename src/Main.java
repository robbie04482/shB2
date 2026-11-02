import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        } else if(exercise==3){
            f3();
        }
        else if(exercise==4){
            f4();
        }
        else if(exercise==5){
            f5();
        }
        else if(exercise==6){
            f6();
        }
        else if(exercise==7){
            f7();
        }
        else if(exercise==8){
            f8();
        }
        else if(exercise==9){
            f9();
        }
        else if(exercise==10){
            f10();
        }



        // TODO: Add conditions for exercises 3-10
        // TODO: Handle an invalid exercise number

    }



    public static void f1() {
        // TODO: Solve exercise 1
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        System.out.print("enter your height: ");
        float height = scanner.nextFloat();
        System.out.println("enter your surnames first letter: ");
        char surname = scanner.next().charAt(0);
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("height: " + height);
        System.out.println("Surname first letter: " + surname);
        System.out.println("age in ten years: " + (10+age));
    }

    public static void f2() {
        // TODO: Solve exercise 2
        System.out.println("enter the amount of seconds: ");
        int time = scanner.nextInt();
        int hours = time/(60*60);
        int minutes = (time%(60*60))/60;
        int seconds = time%60;
        System.out.println("hours: "+ hours);
        System.out.println("minutes: "+ minutes);
        System.out.println("seconds: "+ seconds);
    }

    // TODO: Add f3() through f10()
    public static void f3(){
        System.out.println("enter the amount of the bill: ");
        double bill = scanner.nextDouble();
        System.out.println("enter the percentage of the tip: ");
        double percentage = scanner.nextDouble();
        System.out.println("enter the amount of people: ");
        int people = scanner.nextInt();
        double tip = bill*(percentage/100);
        System.out.println("tip: "+ tip);//would like to use smth like round but round here does not give you,
        System.out.println("total: "+ (tip+bill));
        System.out.println("per person: "+ ((tip+bill)/people));
    }
    public static void f4(){
        float total = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter price of product number " + i + ": ");
            float price = scanner.nextFloat();
            System.out.print("Enter quantity of product number " + i + ": ");
            int qty = scanner.nextInt();
            total += price * qty;
        }

        System.out.print("Enter discount percent: ");
        float discountPercent = scanner.nextFloat();

        float discount = total * discountPercent / 100;
        float finalPrice = total - discount;

        System.out.println("Total before discount: " + total);
        System.out.println("Discount amount: " + discount);
        System.out.println("Final price after discount: " + finalPrice);

        System.out.print("Enter amount paid: ");
        float paid = scanner.nextFloat();
        float change = paid - finalPrice;
        System.out.println("Change: " + change);
    }
    private static void f5() {
        System.out.print("whats the distance: ");
        double distance = scanner.nextDouble();
        System.out.print("whats the time in minutes: ");
        int minutes = scanner.nextInt();

        double hours = minutes / 60.0;
        double speed = distance / hours;

        System.out.println();
        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + speed + " km/h");
        System.out.println("Distance in one hour: " + speed + " km");
    }
    private static void f6(){
        System.out.print("Assignments grade: ");
        float assignments = scanner.nextFloat();
        System.out.print("Quiz grade: ");
        float quiz = scanner.nextFloat();
        System.out.print("Final exam grade: ");
        float finalExam = scanner.nextFloat();

        float finalGrade = assignments * 0.2f + quiz * 0.3f + finalExam * 0.5f;

        System.out.println("Weighted final grade: " + finalGrade);

        if (finalGrade >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    private static void f7(){
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger");
        } else {
            System.out.println("The numbers are equal");
        }
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }
        if (num2 % 5 == 0) {
            System.out.println(num2 + " is divisible by 5");
        } else {
            System.out.println(num2 + " is not divisible by 5");
        }
        int sum = num1 + num2;
        if (sum > 0) {
            System.out.println("The sum is positive");
        } else if (sum < 0) {
            System.out.println("The sum is negative");
        } else {
            System.out.println("The sum is zero");
        }
    }
    private static void f8(){
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error: age cannot be negative");
        } else if (age < 6) {
            System.out.println("Ticket price: 0 NIS");
        } else if (age <= 17) {
            System.out.println("Ticket price: 30 NIS");
        } else if (age <= 64) {
            System.out.println("Ticket price: 45 NIS");
        } else {
            System.out.println("Ticket price: 25 NIS");
        }
    }
    private static void f9(){
        System.out.println("enter a word");
        String str = scanner.next();
        System.out.println(str.length());
        System.out.println((str.toUpperCase()));
        System.out.println((str.toLowerCase()));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
    }
    private static void f10(){
        int a = 7;
        int b = 2;

        System.out.println(a / b);//int/int=int
        System.out.println(a / 2.0);//int/double=double
        int num = 2147483647;

        System.out.println(num);//2^31-1
        System.out.println(num + 1);//-2^31
        double a1 = 0.1;
        double b1 = 0.2;

        System.out.println(a1 + b1);//.0000 because bitwise it cant express this numbers
        System.out.println(a1 + b1 == 0.3);//false because of the line on top

        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);//10^8 because it has no space for more
        System.out.println(highPrecision + 1);//10^8 + 1 because it has more space
    }

}