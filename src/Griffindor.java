public class Griffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private  int bravery;

    public Griffindor(int nobility, int honor, int bravery, int magic,
                      int transgression, String fullName)
    {
        super(magic, transgression, fullName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public Griffindor () {

    }

    public String toString() {
        return "Student " + fullName + "(magic = " + magic +
                ", transgression = " + transgression +
                ", nobility = " + nobility + ", honor = " + honor +
                ", bravery = " + bravery;
    }

    public String compare(Griffindor other) {
        int thisCount = magic + transgression + nobility
                + honor + bravery;
        int otherCount = other.magic + other.transgression + other.nobility
                + other.honor + other.bravery;

        if (thisCount > otherCount) {
            return fullName + "is Win!";
        } else {
            return other.fullName + "is Win!";
        }
    }
}
