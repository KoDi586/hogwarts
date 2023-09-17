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

    public String compare(Griffindor first, Griffindor second) {
        int firstCount = first.magic + first.transgression + first.nobility
                + first.honor + first.bravery;
        int secondCount = second.magic + second.transgression + second.nobility
                + second.honor + second.bravery;

        if (firstCount > secondCount) {
            return first.fullName + "is Win!";
        } else {
            return second.fullName + "is Win!";
        }
    }
}
