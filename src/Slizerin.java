public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int domineering;

    public Slizerin(int cunning, int determination, int ambition, int resourcefulness,
                    int domineering, int magic, int transgression, String fullName)
        {
        super(magic, transgression, fullName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domineering = domineering;
    }
    public Slizerin() {

    }

    public String toString() {
        return "Student " + fullName + "(magic = " + magic +
                ", transgression = " + transgression +
                ", cunning = " + cunning + ", determination = " + determination +
                ", ambition = " + ambition + ", resourcefulness = " + resourcefulness +
                ", domineering = " + domineering;
    }

    public String compare(Slizerin first, Slizerin second) {
        int firstCount = first.magic + first.transgression + first.cunning
                + first.determination + first.ambition
                + first.resourcefulness + first.domineering;

        int secondCount = second.magic + second.transgression + second.cunning
                + second.determination + second.ambition
                + second.resourcefulness + second.domineering;

        if (firstCount > secondCount) {
            return first.fullName + "is Win!";
        } else {
            return second.fullName + "is Win!";
        }
    }
}
