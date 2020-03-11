package io.smallant.imerir.library.data.pojo;


// Part I
public class Book {

    private Integer id;
    private String title;
    private Float price;
    private String cover;
    private Float note;
    private String description;

    public Book(Integer id, String title, Float price, String cover, Float note, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.cover = cover;
        this.note = note;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                ", note=" + note + '\'' +
                ", description=" + description +
                '}';
    }
}
