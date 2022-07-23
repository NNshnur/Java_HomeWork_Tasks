package HomeWork_2;

public class TaskFour_Main {
    public static void main(String[] args) {
        Chinshilla chinshilla = new Chinshilla("Fluffy", 0.5);
        GuineaPig guineaPig = new GuineaPig(2, "Marshmallow");
        System.out.println(chinshilla.getName() + " " + chinshilla.getWeight());
        System.out.println(guineaPig.getName() + " " + guineaPig.getAge());
    }
}
