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

    public String compare(Slizerin other) {
        int thisCount = magic + transgression + cunning
                + determination + ambition
                + resourcefulness + domineering;

        int otherCount = other.magic + other.transgression + other.cunning
                + other.determination + other.ambition
                + other.resourcefulness + other.domineering;

        if (thisCount > otherCount) {
            return fullName + "is Win!";
        } else {
            return other.fullName + "is Win!";
        }
    }
}
