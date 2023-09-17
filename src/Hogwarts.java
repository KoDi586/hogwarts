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


    public String toString(Object object) {
        return object.toString() + ");";
    }
}
