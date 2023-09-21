import java.util.Random;
import java.util.Scanner;
 class Test
 {
   public static void main(String args[])
   { 
     Scanner sc = new Scanner(System.in);
     int no=1,num,count=0,score=0,again=1;
     System.out.println("welcome to Number game");
     System.out.println("You have only 5 chance to guess a number");
     while(again==1)
     { 
       score=0;
       count=0;
     while(no==1)
     {
     count++;
     System.out.println("you have to guess any number between 1 to 100");
     int n=sc.nextInt();
     Random random = new Random();
     num = random.nextInt(100);
    System.out.println("Genrated Random Number="+num);
   if (num==n)
   {
   System.out.println("your guess is correct");
   score++;
   System.out.println();
   }
   else if(num!=n)
   {
   System.out.print("your guess is incorrect");
   if(num>n)
   {
   System.out.println(" and it is  too low");
   System.out.println();
   }
   else if(num<n)
   {
   System.out.println(" and it is too large");
   System.out.println();
   }
   }
       if(count>=5)
      {
        no=0;
      System.out.println("you have reached your limit");
      break;
      }
     no=1;
    }
    System.out.println("Total score="+score+"/5");
    System.out.println("Want to play again? \n  If yes Enter 1 Otherwise 0");
    again=sc.nextInt();
    if(again ==1)
     no=1;
    if(again==0)
    {
      System.out.println("Exit ");
      break;
    }
   }
  }
 }