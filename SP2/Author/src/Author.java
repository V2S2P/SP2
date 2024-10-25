import java.util.*;
public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }
    public void addTitle(Title title){
        titles.add(title);
    }
    public float calculateTotalPay(){
        double totalPay = 0.0;

        for (Title title:titles){
            totalPay += title.calculatePoints() * title.rate;
        }
        return (float) totalPay;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }
}
