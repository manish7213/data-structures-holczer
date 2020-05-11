package com.manish.ds.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author manishkumar75
 */
public class ReservoirSampling {

    public static void main(String[] args) {
        int[] stream = {1,2,3,4,5,6,7,54,2,3,4,9,12,45,2,3};
        int k = 3;
        int[] reservoir = getElements(stream,k);
       for (int i : reservoir)
           System.out.print(i+" ");
    }

    private static int[] getElements(int[] stream,int k) {
        int[] reservoir = new int[k];
        for(int i = 0 ; i < k ; i++) {
            reservoir[i] = stream[i];
        }

        for(int i = k+1; i< stream.length;i++) {

            Random random = new Random();

            int j = random.nextInt(i) + 1;

            if (j < k) {
                reservoir[j] = stream[i];
            }


        }
        return reservoir;
    }
}
