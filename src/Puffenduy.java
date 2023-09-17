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

    public String compare(Puffenduy first, Puffenduy second) {
        int firstCount = first.magic + first.transgression + first.hardworking
                + first.loyal + first.honest;
        int secondCount = second.magic + second.transgression + second.hardworking
                + second.loyal + second.honest;

        if (firstCount > secondCount) {
            return first.fullName + "is Win!";
        } else {
            return second.fullName + "is Win!";
        }
    }
}
