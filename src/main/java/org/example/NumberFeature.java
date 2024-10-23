package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        int binaryValue = 1;
        // 你的代码逻辑
        while (inputNumber > 0) {
            int digit = inputNumber % 10; 
            int position = (int) (Math.log10(inputNumber) + 1);  
            inputNumber /= 10;
            if ((digit % 2 == 1 && position % 2 == 1) || (digit % 2 == 0 && position % 2 == 0)) {
                result += binaryValue;  
            }

            binaryValue *= 2;  
        }
        System.out.println(result);
    }
}
