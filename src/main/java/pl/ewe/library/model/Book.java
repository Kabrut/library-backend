package pl.ewe.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer bookId;
    @OneToOne
    private BookLocation location;
    @ManyToMany
    private List<Author> listOfAuthors;
    private String title;
    private String publishingHouse;
    private Integer yearOfPublish;
    private double value;
    private String type;
    private boolean isAvailable;

    public Book(BookLocation location, String title, String publishingHouse, Integer yearOfPublish, double value, String type) {
        this.location = location;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.value = value;
        this.type = type;
        this.isAvailable = true;
    }

    public Book() {
        this.isAvailable = true;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public BookLocation getLocation() {
        return location;
    }

    public void setLocation(BookLocation location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(Integer yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
