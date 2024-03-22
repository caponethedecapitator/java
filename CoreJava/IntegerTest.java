package CoreJava;

import static java.lang.Math.*;
public class IntegerTest {
    public static void main(String[] args)
    {
        double init_value = 5.997;
        int value_approximation_1 = (int) init_value;
        System.out.println(value_approximation_1);
        int value_approximation_2 = (int) round(init_value);
        System.out.println(value_approximation_2);
    }
}
