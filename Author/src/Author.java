import java.util.*;
public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }
    public void addTitle(Title title){
        ArrayList<Title> titles1 = new ArrayList<>();
        titles1.add(title);
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public java.lang.String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Title: " + titles;
    }
}
