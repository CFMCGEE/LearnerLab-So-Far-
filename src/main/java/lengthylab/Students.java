package lengthylab;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    int max = 200;
    int min = 100;
    int range = max - min + 1;

    int rand = (int) (Math.random() * range) + min;

    private Students() {

        this(new Students(),  10);

    }


    public Students(Students INSTANCE, int id) {


    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
