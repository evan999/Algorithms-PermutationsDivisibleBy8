package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Result result = new Result();
        List<String> numbers = new ArrayList<>();
        numbers.add("312");
        numbers.add("240");
        System.out.println(result.checkDivisibility(numbers));
    }
}
