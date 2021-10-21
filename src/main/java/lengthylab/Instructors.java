package lengthylab;

public class Instructors {

    private static final Instructors INSTANCE = new Instructors();

    int max = 200;
    int min = 100;
    int range = max - min + 1;

    int rand = (int) (Math.random() * range) + min;

    private Instructors() {

        this(new Instructors(),  10);

    }


    public Instructors(Instructors INSTANCE, int id) {


    }

    public static Instructors getInstance() {
        return INSTANCE;
    }



}
