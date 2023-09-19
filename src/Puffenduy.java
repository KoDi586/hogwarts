public class Puffenduy extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(int hardworking, int loyal, int honest, int magic,
                     int transgression, String fullName)
        {
        super(magic, transgression, fullName);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public Puffenduy() {

    }

    public String toString() {
        return "Student " + fullName + "(magic = " + magic +
                ", transgression = " + transgression +
                ", hardworking = " + hardworking + ", loyal = " + loyal +
                ", honest = " + honest;
    }

    public String compare(Puffenduy other) {
        int thisCount = magic + transgression + hardworking
                + loyal + honest;
        int otherCount = other.magic + other.transgression + other.hardworking
                + other.loyal + other.honest;

        if (thisCount > otherCount) {
            return fullName + "is Win!";
        } else {
            return other.fullName + "is Win!";
        }
    }
}
