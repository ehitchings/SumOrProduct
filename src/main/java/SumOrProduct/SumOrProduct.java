package SumOrProduct;
import java.util.Scanner;
/**
 * Created by evanhitchings on 9/9/16.
 */
public class SumOrProduct {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Product product = new Product();
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = reader.nextInt();
        int selection = 0;
        do {
            System.out.println("Select: \n 1: Sum \n 2: Product");
            selection = reader.nextInt();
        } while (selection > 2 || selection < 1 );

        if (selection == 1){
            System.out.println(sum.sumNumber(number));
        } else {
            System.out.println(product.productNumber(number));
        }

    }
}
