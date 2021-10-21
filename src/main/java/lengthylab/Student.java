package lengthylab;

public class Student extends Person implements Learner {

  //instance variable
    public double totalStudyTime;

  //concrete implementation
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
