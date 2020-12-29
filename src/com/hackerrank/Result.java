package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<String> checkDivisibility(List<String> arr){
        // Returns a list of strings "YES" or "NO" if divisible by 8
        List<String> results = new ArrayList<>();

        // Check the last three digits of each number if they're divisible by 8.
        // Edge case: numbers with less than 3 digits

        boolean isEven = false;

//        char lastDigit = arr.get(arr.size()-1);


        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() >= 3){
                String lastThree = arr.get(i).substring(arr.get(i).length()-3);
                if(Integer.parseInt(lastThree) % 2 == 0){
//                    isEven = true;
                    results.add("YES");
                }
                else{
                    // At this point, we know this number cannot be divisible by 8
                    // with any permutation
                    results.add("NO");
                }
            }
        }

//        if(arr.size() >= 3){
//
//        }
//        else{
//            // Check the digits for numbers with less than 3 digits
//        }

        return results;
    }

    public static int[] swap(int[] value, int i, int j){
        int item = value[i];
        value[i] = value[j];
        value[j] = item;
        return value;
    }

    static boolean isDivisbleBy8(List<Integer> nums){

        int remainder = 0;
        for(int i = nums.size() - 1; i >= 0; i--){
            remainder = remainder * 10 + nums.get(i);
            remainder %= 8;
        }
        return remainder == 0;
    }
}
