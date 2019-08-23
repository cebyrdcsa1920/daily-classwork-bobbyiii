import java.util.Scanner;

public class HelloDate
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hey, are you busy saturday night?");
        String Nah = keyboard.nextLine();
        System.out.println("Well... if you aren't busy I am throwing a party. You wanna come.");
        String Maybe = keyboard.nextLine();
        System.out.println(" Okay it will mean a lot Bob..");
        String Ight = keyboard.nextLine();
    }
}