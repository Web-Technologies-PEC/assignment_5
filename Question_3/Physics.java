package Question_3;

public class Physics extends Marks {
    double physicsMarks;

    public Physics(String name, double physicsMarks) {
        super(name, physicsMarks);
        this.physicsMarks = physicsMarks;
        Marks.totalMarks += physicsMarks;
        Marks.classTotalMarks += physicsMarks;
    }

}
