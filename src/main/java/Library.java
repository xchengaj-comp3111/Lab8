import lab2.ex1.Book;
import lab2.ex2.*;

public class Library {
    /* Add this function */
    public static void main(String[] args) {
        final String[] array = {"Basic Java", "Advance Java", "Forget about Java"};
        Book b = new Book(array);

        System.out.println("Title of Ch.1: " + b.getChapter(1));
        String[] anotherArray = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters");
        System.out.println(java.util.Arrays.toString(anotherArray));

        b.addChapters("new Ch");

        MobileComputer mc = new MobileComputer();
        for (int i = 0; i < 10; i++) {
            mc.work();
        }

        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();

        c.charge(p);
        c.charge(m);

    }

    public boolean someLibraryMethod() {
        return true;
    }
}
