package HomeWork_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork_Lesson1 {
    public static void main(String[] args) {
        // Task 1.1

        String hi = "                 Hello";
        String world = " WoRld!";
        char newLine = '\n';
        String text = hi.trim() + world.toLowerCase() + '\n';
        System.out.println(text.repeat(3));

        //Task 2.1

        double height = 1.76;
        int weight = 61;
        double BMI = weight/(height * height);
        System.out.println(BMI);

        //Tak 3.1

        char [] letters = new char []{ 'a', 'b', 'c', 'd', 'e'};
        String str = String.valueOf(letters);
        System.out.println(str);
        System.out.println(str.replaceAll("d" , "h"));

        // Task 1.2

        String string = "234";
        int newString = Integer.valueOf("234");

        System.out.println(newString + "some_text".length());

        // Task 2.2

        int a = 3;
        int b = 5;
        int formula = (a+b) * (a+b);
        System.out.println(formula);

        // Task 2.3

        int [] num1 = new int[] { 1, 2, 5, 7, 10 };
        int [] num2 = new int[] { 2, 3, 2, 17, 15 };
        int [] num3 = new int [5];
        num3 [0] = num1[0] * num2[0];
        num3 [1] = num1[1] * num2[1];
        num3 [2] = num1[2] * num2[2];
        num3 [3] = num1[3] * num2[3];
        num3 [4] = num1[4] * num2[4];
        int [] combinedArray = new int [] { 1, 2, 5, 7, 10, 2, 3, 2, 17, 15};
        System.out.println("My concatenated array : ");
        System.out.println(Arrays.toString(combinedArray));
        System.out.println("My first array is  ");
        System.out.println(Arrays.toString(num1));
        System.out.println("My second array is  ");
        System.out.println(Arrays.toString(num2));
        System.out.println("Multiplication result of these two is  ");
        System.out.println(Arrays.toString(num3));

        // Task 2.4

        String phrase = "Hello world!";
        System.out.println(phrase.replaceAll("l", "r").toUpperCase().substring(0,8));


    }
}
