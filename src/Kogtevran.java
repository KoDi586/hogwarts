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

    public String compare(Kogtevran first, Kogtevran second) {
        int firstCount = first.magic + first.transgression + first.smart
                + first.wise + first.witty + first.creative;
        int secondCount = second.magic + second.transgression + second.smart
                + second.wise + second.witty + second.creative;

        if (firstCount > secondCount) {
            return first.fullName + "is Win!";
        } else {
            return second.fullName + "is Win!";
        }
    }
}
