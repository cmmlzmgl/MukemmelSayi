import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
               sum += i;
            }
        }

        if (sum == number)
        {
            System.out.print("Girdiğiniz Sayı Bir Mükemmel Sayıdır!");
        } else{
            System.out.print("Girdiğiniz Sayı Bir Mükemmel Sayı Değildir!");
        }

    }
}
