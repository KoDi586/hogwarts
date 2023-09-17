public class Main {

    public static String compare(Hogwarts first, Hogwarts second) {
        int firstCount = first.magic + first.transgression;
        int secondCount = second.magic + second.transgression;

        if (firstCount > secondCount) {
            return first.fullName + "is Win!";
        } else {
            return second.fullName + "is Win!";
        }
    }

    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor(43, 65, 16, 36, 75,"harryPotter");
        Griffindor hermioneGranger = new Griffindor(13, 54, 25, 76, 75, "hermioneGranger");
        Griffindor ronWeasley = new Griffindor(76, 47, 27, 85, 27, "ronWeasley");

        Slizerin dracoMalfoy = new Slizerin(76, 26, 86, 36, 95, 37, 95, "dracoMalfoy");
        Slizerin grahamMontague = new Slizerin(48, 86, 37, 97, 98, 35, 74, "grahamMontague");
        Slizerin gregoryGoyle = new Slizerin(23, 14, 54, 24, 56, 37, 18, "gregoryGoyle");

        Puffenduy zachariahSmith = new Puffenduy(35, 26, 64, 15, 26, "zachariahSmith");
        Puffenduy cedricDiggory = new Puffenduy(35, 25, 76, 36, 76, "cedricDiggory");
        Puffenduy justinFinchFletchley = new Puffenduy(34, 76, 27, 83, 2, "justinFinchFletchley");

        Kogtevran zhouChang = new Kogtevran(76, 26, 87, 2, 3, 7, "zhouChang");
        Kogtevran padmaPatil = new Kogtevran(76, 38, 9, 87, 27, 8, "padmaPatil");
        Kogtevran marcusBelby = new Kogtevran(4, 7, 15, 75, 26, 99, "marcusBelby");

        //вывожу описание студентов
        Hogwarts newHogw = new Hogwarts();
        System.out.println();
//        System.out.println(newHogw.toString(harryPotter));
//        System.out.println(newHogw.toString(dracoMalfoy));
//        System.out.println(newHogw.toString(zachariahSmith));
//        System.out.println(newHogw.toString(zhouChang));

        //метод сравнивания студентов одного факультета
        Griffindor compareStudents = new Griffindor();
        System.out.println(compareStudents.compare(harryPotter, ronWeasley));
        Slizerin compareStudentss = new Slizerin();
        System.out.println(compareStudentss.compare(dracoMalfoy, gregoryGoyle));

        //метод сравнивания студентов разных факультетов
        System.out.println(compare(harryPotter, dracoMalfoy));

    }
}