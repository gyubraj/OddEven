import java.sql.SQLOutput;
import java.util.*;
public class OddsAndEven {
    static char choose;
    static int fingers;
    static int computer;
    static int sum;
    static String name;

    public static void main(String[] args) {
        pickOddsOrEvens();
        playTheGame();
        winnerTime();


    }

    public static void pickOddsOrEvens () {
            System.out.println("Let's play a game called \"Odds and Evens\"");
            Scanner input = new Scanner(System.in);
            System.out.print("Please Input your name.");
            name=input.nextLine();
        System.out.println("Namaste "+name+" ,Welcome to this Game.");
        System.out.println("Which do you choose ? Odds(O) or Evens(E)");
        choose =input.next().charAt(0);
        if(choose=='O')
            System.out.println(""+name+" has picked Odds ! The computer will be Evens.");
        else
            System.out.println(""+name+" has picked Evens ! The computer will be Odds.");
        for(int i=0;i<20;i++)
            System.out.print("_");
        System.out.println();
          }

          public static void playTheGame() {
        Scanner input = new Scanner(System.in);
              System.out.println("How many fingers you put out?");
              fingers = input.nextInt();
        Random rand = new Random();
        computer = rand.nextInt(6);
              System.out.println("The computer plays "+computer+" fingers.");
              for(int i=0;i<20;i++)
                  System.out.print("_");
              System.out.println();
              sum = fingers+computer;
              System.out.println(""+fingers+" + "+computer+" = "+(fingers+computer)+"");
              if(sum%2==0)
                  System.out.println(""+sum+" is Even.");
              else
                  System.out.println(""+sum+" is Odd.");

          }
          public static void winnerTime(){
        if(sum%2==0&&choose=='E')
            System.out.println("That means "+name+" wins.");
        else if(sum%2!=0&&choose=='O')
             System.out.println("That means "+name+" wins.");
       else
            System.out.println("That means "+name+" lose.");


          }

}
