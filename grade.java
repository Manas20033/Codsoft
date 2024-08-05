package studentgrade;
import java.util.*;
public class grade {
    public static void main(String[] args)
    {

        
        System.out.println("Enter The Six Subject Marks ");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Math Marks : ");
        int math = input.nextInt();
        System.out.print("Enter Science Marks : ");
        int science = input.nextInt();
        System.out.print("Enter English Marks : ");
        int english = input.nextInt();
        System.out.print("Enter Hindi Marks : ");
        int hindi = input.nextInt();
        System.out.print("Enter Marathi Marks : ");
        int marathi = input.nextInt();
        System.out.print("Enter History Marks : ");
        int history = input.nextInt();

        int total = math + science + english + hindi + marathi + history ;
        float percentage = total/6;
        System.out.println("Total Marks : "+ total+"/500");
        System.out.println("Percentage is : "+percentage);

        if(percentage >= 90){
            System.out.println("Grade A");
        }else if (percentage >= 85){
            System.out.println("Grade B");
        }else if ( percentage >= 70){
            System.out.println("Grade C");
        }else if (percentage >= 55){
            System.out.println("Grade D");
        }else if ( percentage >= 35 ){
            System.out.println("Grade E");
        }else{
            System.out.println("fail");
        }
    }
}

