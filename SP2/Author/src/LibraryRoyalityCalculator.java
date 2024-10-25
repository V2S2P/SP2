public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        Author author = new Author("Big Hank");
        Title book1 = new PrintedBook("Hank on adventure","BI",140,72);
        author.addTitle(book1);
        System.out.println(author.getTitles());
        System.out.println(author.calculateTotalPay());

        Author author2 = new Author("Valdemar");
        Title audioBook = new AudioBook("How to break out of jail", "SKØN", 10, 400);
        author2.addTitle(audioBook);
        System.out.println(author2.getTitles());
        System.out.println(audioBook.calculateLiteraturePoints());
        System.out.println(author2.calculateTotalPay());
    }
}