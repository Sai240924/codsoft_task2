import java.util.*;
public class gradeCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int n=s.nextInt();
        int[] marks=new int[n];
        for(int i=1;i<=n;i++){
            System.out.println("Enter Subject-"+i+" marks :");
            marks[i-1]=s.nextInt();
        }
        int total=0;
        for(int m:marks){
            total+=m;
        }
        float avg=total/(float)n;
        System.out.println("\nTotal Marks : "+total);
        System.out.println("Average Percentage : "+avg+"%");
        if (avg>=90) {
            System.out.println("Grade : A");
        }else if (avg>=80) {
            System.out.println("Grade : B");
        }else if (avg>=70) {
            System.out.println("Grade : C");
        }else if (avg>=60) {
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : F");
        }
        s.close();
    }
}