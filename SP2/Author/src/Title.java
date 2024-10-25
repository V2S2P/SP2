public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate = 0.067574;
    }
    public double calculateRoyalty(){
        return 20;
    }
    @Override
    public String toString() {
        return "\nTitle: " + title + "\nType of Lit: " + literatureType + "\nAmount of copies: " + copies;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public abstract double calculatePoints();
    public abstract double calculateLiteraturePoints();
}
