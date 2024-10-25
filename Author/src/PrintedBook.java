public class PrintedBook extends Title{
    private int pages;
    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title,literatureType,copies);
        this.pages = pages;
    }
    @Override
    public double calculatePoints(){
        return 20;
    }
    @Override
    public double calculateLiteraturePoints(){
        return 20;
    }
}
