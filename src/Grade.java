import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");


        int Phy=sc.nextInt();
        int Chem=sc.nextInt();
        int Bio=sc.nextInt();
        int Math=sc.nextInt();
        int comp=sc.nextInt();
        double percentage;
        int total_marks=Phy+Chem+Bio+Math+comp;
        percentage=(total_marks*100)/500;
        if (percentage>=90){
            System.out.println(percentage+ " Grade A");
        }
        else if (percentage>=80) {
            System.out.println(percentage+ " Grade B");
        }
        else if (percentage>=70) {
            System.out.println(percentage+ " Grade C");
        }
        else if (percentage>=60) {
            System.out.println(percentage+ " Grade D ");
        }
        else if (percentage>=40) {
            System.out.println(percentage+ " Grade E");
        }
        else  {
            System.out.println(percentage+ " Grade F");
        }
    }
}
