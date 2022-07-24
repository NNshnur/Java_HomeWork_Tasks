package HomeWork_2;

import java.util.Arrays;

public class TaskOneTwoAndThree {
    public static void main(String[] args) {

        // Task1 - Beginner Level

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a" + '\t');
        }
        System.out.println();

        // Task2 - Beginner Level

        int ageChildren = 7;
        if (ageChildren <= 6) {
            System.out.println("Child care center");
        } else if (ageChildren <= 11) {
            System.out.println("Elementary school");
        } else if (ageChildren <= 17) {
            System.out.println("Secondary school");
        } else {
            System.out.println("University");
        }

        // Task3 - Beginner Level

        boolean chicken = true;
        boolean veggies = false;
        boolean sauce = true;
        boolean croutons = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken && veggies && sauce && croutons) {
            System.out.println("We have all ingredients for Caesar salad");
        } else if (veggies && eggs && (sausage || chicken)) {
            System.out.println("Since we don't have all ingredients for Caesar salad, let us make Oliv'e salad instead");
        } else if (veggies) {
            System.out.println("Ok, it seems we don't have many options to choose from, so let us make Vegetable salad");
        } else {
            System.out.println("Well, well, well.... I can't make any salad, I just simply don't have ingredients to make any of them");
        }

        // Task1 - Intermediate Level

        double increment = 0.01123;
        double result = 0;
        int count = 0;

        for (int i = 0; result <= 1_000_000; result = result + increment) {
            count++;
            if (increment <= 0) {
                break;
            }

        }
        System.out.println(count);

        //   Task2 - Intermediate Level

        int[] numbers = {1, 1, 1, 1, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

        //      Task3 - Intermediate Level

        boolean hasFuel = true;
        boolean hasElectricalProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        double priceBilled = 0;
        int countIssues = 0;

        if (!hasFuel && !(hasElectricalProblem || hasMotorProblem || hasWheelsProblem || hasTransmissionProblem)) {
            priceBilled = 1000;
        } else {
            if (hasMotorProblem) {
                priceBilled = priceBilled + 10_000;
                countIssues++;
            }
            if (hasElectricalProblem) {
                priceBilled = priceBilled + 5_000;
                countIssues++;

            }
            if (hasTransmissionProblem) {
                priceBilled = priceBilled + 4_000;
                countIssues++;

            }
            if (hasWheelsProblem) {
                priceBilled = priceBilled + 2_000;
                countIssues++;
            }
            if (countIssues >= 2) {
                priceBilled = priceBilled * 0.9;

            }
            if (hasTransmissionProblem && (hasMotorProblem || hasElectricalProblem)) {
                priceBilled = priceBilled * 0.8;

            }
        System.out.println(priceBilled);
        }

    }



