
/**
 * Write a description of class mastermind here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class mastermind
{
    private int red, yellow, orange, green, blue, purple;
    
    public mastermind()
    {
        int red = 1;
        int yellow = 2;
        int orange = 3;
        int green = 4;
        int blue = 5;
        int purple = 6;
    }
    public static void main(String args[])
    {
       int userinput = 10;
       Random rand = new Random();
       int x = rand.nextInt(6) + 1;
       int x1 = rand.nextInt(6) + 1;
       int x2 = rand.nextInt(6) + 1;
       int x3 = rand.nextInt(6) + 1;
      
       while (userinput > 0 & userinput < 11) 
       {
        System.out.println("The computer has randomly chosen four numbers that are all from 1 to 6. You will have ten tries to guess them in order: ");
        Scanner nreader = new Scanner(System.in);
        int y = nreader.nextInt();
        int y1 = nreader.nextInt();
        int y2 = nreader.nextInt();
        int y3 = nreader.nextInt();
            if ( y == x & y1 == x1 & y2 == x2 & y3 == x3)
            {
                System.out.println("Congratulations, you have won the game!");
                userinput ++;
                break;
            }
            if ( y != x & y1 == x1 & y2 == x2 & y3 == x3) 
            {
                System.out.println("You have incorrectly guessed one of the numbers or you may have misplaced one of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            if ( y == x & y1 != x1 & y2 == x2 & y3 == x3) 
            {
                System.out.println("You have incorrectly guessed one of the numbers or you may have misplaced one of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            if ( y == x & y1 == x1 & y2 != x2 & y3 == x3) 
            {
                System.out.println("You have incorrectly guessed one of the numbers or you may have misplaced one of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            if ( y == x & y1 == x1 & y2 == x2 & y3 != x3) 
            {
                System.out.println("You have incorrectly guessed one of the numbers or you may have misplaced one of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y == x & y1 == x1 & y2 != x2 & y3 != x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y == x & y1 != x1 & y2 == x2 & y3 != x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y == x & y1 != x1 & y2 != x2 & y3 == x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y != x & y1 == x1 & y2 == x2 & y3 != x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y != x & y1 != x1 & y2 == x2 & y3 == x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y != x & y1 == x1 & y2 != x2 & y3 == x3)
            {
                System.out.println("You have incorrectly guessed two of the numbers or you may have misplaced two of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
            else if ( y != x & y1 != x1 & y2 != x2 & y3 == x3)
            {
                System.out.println("You have incorrectly guessed three of the numbers or you may have misplaced three of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }   
            else if ( y == x & y1 != x1 & y2 != x2 & y3 != x3)
            {
                System.out.println("You have incorrectly guessed three of the numbers or you may have misplaced three of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }  
            else if ( y != x & y1 == x1 & y2 != x2 & y3 != x3)
            {
                System.out.println("You have incorrectly guessed three of the numbers or you may have misplaced three of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            } 
            else if ( y != x & y1 != x1 & y2 == x2 & y3 == x3)
            {
                System.out.println("You have incorrectly guessed three of the numbers or you may have misplaced three of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }  
            else
            {
                System.out.println("You have incorrectly guessed four of the numbers or you may have misplaced all of the correct numbers. Please try again: ");
                userinput -= 1;
                System.out.println("You have " + userinput + " lives left");
                continue;
            }
       }
       if (userinput == 0)
       {
           System.out.println("You have used up your ten tries. Gameover!");
       }
    }
}
