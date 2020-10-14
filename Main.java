import java.util.Scanner;
// impot this to help scanner

public class Main
{
   public static void main(String[] args)
   {
     // you start of with public class main and then you do public static void main(string[] args) to start off your program
     Scanner scan = new Scanner(System.in);
//if you are adding a scanner these are the steps to doing a scanner on your program.
 System.out.println("whats your name?");
 System.out.println("Bryson Whitmore");
     System.out.println("Whats your age?");
     System.out.println("14");
   System.out.println("what's your senior quote");
   System.out.println("Get good Grades to have a Good Life.");
   System.out.println("Thank you"+ " Bryson Whitmore, " + "you are now" + " 14 " + "years old");
   System.out.println("and your senior qoute is" + " Get good Grades to have a Good Life. ");
    
     {
       System.out.println("x is the number of controllers you have");
     }
    boolean gradesBroughtUp = true;
     boolean playedVideoGames = false;
     if (gradesBroughtUp && playedVideoGames)
     {
         System.out.println("No, you can't play video games");
     }
     else
     {
        
       boolean ageIs=true;
       boolean mathGrade=false;
       if( ageIs || mathGrade );
       System.out.println("If your age is 14 or up you can play the video games or if your math grade is brought up to over a 70%, you can play the video games");
       boolean haveFiveFriends=true;
       boolean haveFiveControllers=true;
       if (haveFiveFriends && !haveFiveControllers);
       System.out.println("you may have five friends over after you get four more controllers for the playstation or whatever you call it, a ps4, or else you can't play together on the two television screens in the different rooms.");



     }

  }
}

