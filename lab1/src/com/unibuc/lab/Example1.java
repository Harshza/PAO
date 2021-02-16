//package trebuie sa fie prima linie executabila din fisier
/*



 */
package com.unibuc.lab;

import java.util.Random;

public class Example1 {
    public static void main(String args[]){

        Random myRandom = new Random(5);
        int myInt = myRandom.nextInt();

        System.out.print(myRandom.nextInt());
    }
}
