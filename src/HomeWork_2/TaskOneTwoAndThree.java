package HomeWork_2;

public class TaskOneTwoAndThree {
    public static void main(String[] args) {

        // Task1

        for (int i = 1; i<=100; i++) {
            System.out.print(i + "a" + '\t');
        }
        System.out.println();

        // Task2

        int ageChildren = 7;
        if (ageChildren<=6) {
            System.out.println("Child care center");
        } else if (ageChildren<=11) {
            System.out.println("Elementary school");
        } else if (ageChildren <=17) {
            System.out.println("Secondary school");
        } else {
            System.out.println("University");
        }

        // Task3

        boolean chicken = true;
        boolean veggies = false;
        boolean sauce  = true;
        boolean croutons = true;
        boolean sausage = true;
        boolean eggs = true;

        if(chicken && veggies && sauce && croutons) {
            System.out.println("We have all ingredients for Caesar salad");
        } else if (veggies && eggs && (sausage || chicken)) {
            System.out.println("Since we don't have all ingredients for Caesar salad, let us make Oliv'e salad instead");
        } else if (veggies) {
            System.out.println("Ok, it seems we don't have many options to choose from, let us make Vegetable salad");
        } else {
            System.out.println("Well, well, well.... I can't make any salad, I don't have the right ingredients");
        }
    }
}
