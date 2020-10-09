public class Main
{
   public static void main(String[] args)
   {
     
     int count = 14;

     
     while (count <= 14)
     {
        System.out.println(count);
        
        count++;
     }
    int x = 2;
     if (x < 0)
     {
       System.out.println("x is negative");
     }
     else if(x == 0)
     {
        System.out.println("x is 0");
     }
     else
     {
       System.out.println("x is positive");
     }
    boolean gradesBroughtUp = true;
     boolean playedVideoGames = false;
     if (gradesBroughtUp && playedVideoGames)
     {
         System.out.println("No, you can't play video games");
     }
     else
     {
         System.out.println("After the condition of the grades being brought up and homework being done, you can play video games.");  
       boolean ageIs=true;
       boolean mathGrade=false;
       if( ageIs || mathGrade );
       System.out.println("If your age is 14 or up you can play the video games or if your math grade is brought up to over a 70%, you can play video games");
       boolean haveFiveFriends=true;
       boolean haveFiveControllers=true;
       if (haveFiveFriends && !haveFiveControllers);
       System.out.println("you may have five friends over after you get four more controllers or else you can't play together on the two television screens.");
     }

   }
}