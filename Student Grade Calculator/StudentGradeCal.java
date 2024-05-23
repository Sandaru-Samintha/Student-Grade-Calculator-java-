import java.util.Scanner;
import java.lang.Math;

class StudentGradeCal 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print(" Enter the number of subjects :  ");
        int numOfsub = input.nextInt();


        System.out.println();
        System.out.println(" ---------------:The subject marks should be out of 100..! so enter the 0 to 100 number :-------------  ");
        System.out.println();
        double sum=0;
        for(int i=1;i<=numOfsub;i++)
        {
            System.out.print("Enter the subject " + i + " mark : ");
            double subMark=input.nextDouble();
            if( subMark >100 || subMark < 0)
            {
                System.out.println();
                System.out.println("Unrecoqnized input . Enter 0 to 100 number...!");
                System.out.println();

                System.out.print("Enter the subject " + i + " mark : ");
                subMark=input.nextDouble();
            }
            if(subMark <=100 || subMark >= 0)
            {
                sum=sum + subMark;
            }    
        }
        double aveOfsub = sum/numOfsub;
        
        String Grade = "";
        if(aveOfsub >=75)
        {
            Grade = "A";
        }
        else if(aveOfsub >=65)
        {
            Grade = "B";
        }
        else if(aveOfsub >=55)
        {
            Grade = "C"; 
        }
        else if(aveOfsub >=40)
        {
            Grade = "S"; 
        }
        else if(aveOfsub <40)
        {
            Grade = "F"; 
        }
        System.out.println();
        System.out.println("The total marks of the User : " + "\t\t\t" + sum);
        System.out.println("The average precentage of each subjects : " + "\t" + aveOfsub + "%");
        System.out.println("The corresponding grade of User  : " + "\t\t"  + Grade) ;

    }
}
