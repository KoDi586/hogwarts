public class Hogwarts {
    public int magic;
    public int transgression;
    public String fullName;

    public Hogwarts(int magic, int transgression, String fullName) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }
    public Hogwarts() {

    }

    public String compareHogwarts(Hogwarts other) {
        int thisCount = magic + transgression;
        int otherCount = other.magic + other.transgression;

        if (thisCount > otherCount) {
            return fullName + "is Win!";
        } else {
            return other.fullName + "is Win!";
        }
    }


    public String toString(Object object) {
        return object.toString() + ");";
    }
}
