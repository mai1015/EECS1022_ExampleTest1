package eecs1022.exampletest1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilities
{
    /*
        No attributes.
        Do not add any attributes.
     */

    /*
        Default constructor.
        Do not change it.
     */
    Utilities() {

    }

    /*
        Given the radius of a circle,
        return its area.
     */
    double areaOfCircle(double radius) {
        /*
            Your task is to implement this method,
            so that running UtilitiesTester.java will output the expected value to console.
         */
        // BigDecimal help convert and round up the number
        return BigDecimal.valueOf(Math.PI * radius * radius).setScale(1, RoundingMode.HALF_UP)
                .doubleValue();
        // Simple way
        // pi = 3.14159
        //return 3.1 * radius * radius;
    }
    /*
        Given four integers,
        return their average with precision.
     */
    double averageOf(int a, int b, int c, int d) {
        //Your task is to implement this method,

        //so that running UtilitiesTester.java will output the expected value to console.

        // add and divide
        return ((double)(a + b + c + d))/4;
    }

    /*
        Given three integers (which may or may not be equal),
        return the maximum.
     */
    int maximumOf(int x, int y, int z) {
        /*
            Your task is to implement this method,
            so that running UtilitiesTester.java will output the expected value to console.
         */
        // when x > y
        if (x > y) {
            // when x > z and x > y
            if (x > z) {
                return x;
            }
        // when y >= x and y > z
        } else if (y > z){
            return y;
        }
        // when y >= x and z >= y
        return z;
    }

    /*
        Given four integers,
        return whether or not they represent an arithmetic sequence.
     */
    boolean isArithmeticSeq(int n1, int n2, int n3, int n4) {
        /*
            Your task is to implement this method,
            so that running UtilitiesTester.java will output the expected value to console.
         */
        // calculate the gap
        int gap = n2 - n1;
        //if ( condition ) condition is true or false
        // condition = true/false
        // can return condition
        return (n3 - n2) == gap && (n4 - n3) == gap;
    }

}
