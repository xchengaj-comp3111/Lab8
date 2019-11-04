package lab2.ex1;

public class Book {
    private String[] chapters;
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++) {
            chapters[i] = "Chapter" + i;
        }
    }

    public Book(String[] c) {
        this.chapters = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            this.chapters[i] = c[i];
        }
    }

    public String getChapter(int i) {
        if (i < 0 || i > chapters.length) {
            return "Invalid chapter";
        }
        else {
            return chapters[i];
        }
    }

    public String[] getChapters() {
        return chapters;
    }

    /**!
     *
     * @param newChapter
     */
    public void addChapters(String newChapter) {
        String[] newChs = new String[chapters.length+1];
        for (int i = 0; i < chapters.length; i++) {
            newChs[i] = chapters[i];
        }
        newChs[chapters.length] = newChapter;
        chapters = newChs;
	System.out.println("Add succeeds");
    }

}
