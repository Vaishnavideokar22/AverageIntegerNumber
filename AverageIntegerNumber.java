import java.util.Scanner;
class Average{
    public int AverageNumber(int a, int b,int c){

        int avg = a+b+c/3;

        System.out.println("The Average Of Three Integer Numbers Is:" + avg);

        return avg;

}
}

public class AverageIntegerNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Average a1 = new Average();

        System.out.println("Enter The Integer Value For a");
        int a = sc.nextInt();

        System.out.println("Enter the Integer value for b");
        int b = sc.nextInt();

        System.out.println("Enter The Integer Value For c");
        int c = sc.nextInt();

        a1.AverageNumber(a,b,c);
    }
    
}
