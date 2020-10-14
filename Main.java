import java.util.Scanner;
// import this to help the scanner

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
   System.out.println(" Get good Grades to have a Good Life.");
   System.out.println("Thank you"+ " Bryson Whitmore, " + "you are now" + " 14 " + "years old");
   System.out.println("and your senior qoute is" + " Get good Grades to have a Good Life. ");
   // 1. initialize the loop variable
     int count = 14;

     // 2. test the loop variable
     while (count <= 14)
     {
        System.out.println(count);
        // 3. change the loop variable
        count++;
     }
//then add an if/else statement to the equation to get this.
    if (count < 14)
    //you can replace any of the numbers as long as you have x or count and keep the negative, zero, and positive part to see if the number here will get you your solution.
{
   System.out.println("x is negative");
}
else if (count == 14)
{
   System.out.println("x is zero");
}
else
{
   System.out.println("x is positive");
}
//the next thing that you do is add a true/false idea into the mix to see if you can do one thing or if you can't do that one thing.
    boolean gradesBroughtUp = true;
     boolean playedVideoGames = false;
     if (gradesBroughtUp && playedVideoGames)
     {
         System.out.println("No, you can't play video games");
     }
     else
     {
        //then add a and/or/not statement to this part to see if you get to play video games because of your age or if you get your math grades up so that you can play the video games.
       boolean ageIs=true;
       boolean mathGrade=false;
       if( ageIs || mathGrade );
       System.out.println("If your age is 14 or up you can play the video games or if your math grade is brought up to over a 70%, you can play the video games");
       //this next part tells you if you can play the video games with your friends if you have some friends and you don't have five controllers which means that you won't have the friends over until you get those five controllers. 
       boolean haveSomeFriends=true;
       boolean haveFiveControllers=true;
       if (haveSomeFriends && !haveFiveControllers);
       System.out.println("you may have five friends over after you get four more controllers for the playstation or else you can't play together on the two television screens in the different rooms.");



     }

  }
}

