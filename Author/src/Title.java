public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }
    public double calculateRoyalty(){
        return 20;
    }
    public abstract double calculatePoints();
    public abstract double calculateLiteraturePoints();
}
