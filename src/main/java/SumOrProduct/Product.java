package SumOrProduct;

/**
 * Created by evanhitchings on 9/9/16.
 */
public class Product {

    public int productNumber(int endNumber){
        int product = 1;
        for (int i = 1; i <= endNumber; i++){
            product *= i;
    }
        return product;
    }

}
