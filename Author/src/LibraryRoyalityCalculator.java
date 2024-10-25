public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        Author author = new Author("Big Hank");

        Title book1 = new PrintedBook("Hank on adventure","BI",200,150);
        author.addTitle(book1);
        System.out.println(author.toString());

    }
}