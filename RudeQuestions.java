import java.util.Scanner;

public class RudeQuestions{
	public static void main( String[] args){
		String name, hobby;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("HI," + name +"! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? that's not very old.");
        System.out.print("How much do you weight,  " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quite!!");
        System.out.print("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is "+ income + "per hour ");
        System.out.println("And not per year!");

        System.out.print("Whats's your hobby " + name + "? ");
        hobby = keyboard.next();
        System.out.println("ohh WOW , your hobby is " + hobby);

        System.out.print("well, thanks for answering my rude question, ");
        System.out.println(name + ". ");
    }
}