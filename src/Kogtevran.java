public class Kogtevran extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;


    public Kogtevran(int smart, int wise, int witty, int creative, int magic,
                     int transgression, String fullName)
        {
        super(magic, transgression, fullName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public Kogtevran () {

    }

    public String toString() {
        return "Student " + fullName + "(magic = " + magic +
                ", transgression = " + transgression +
                ", smart = " + smart + ", wise = " + wise +
                ", witty = " + witty + ", creative = " + creative;
    }

    public String compare(Kogtevran other) {
        int thisCount = magic + transgression + smart
                + wise + witty + creative;
        int otherCount = other.magic + other.transgression + other.smart
                + other.wise + other.witty + other.creative;

        if (thisCount > otherCount) {
            return fullName + "is Win!";
        } else {
            return other.fullName + "is Win!";
        }
    }
}
