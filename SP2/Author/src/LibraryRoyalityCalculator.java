public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        Author author = new Author("Big Hank");
        Title book1 = new PrintedBook("Hank on Adventure", "BI", 140, 72);
        Title book2 = new PrintedBook("Hank on Adventure 2", "TE", 200, 130);
        Title audioBook = new AudioBook("The Great Escape", "SKØN", 10, 400);

        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(audioBook);

        System.out.println(author);
        System.out.println(author.getName() + ": " + String.format("%.2f", author.calculateTotalPay()) + " kr");
    }
}
