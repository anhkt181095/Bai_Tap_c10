public class Book {
    private String bookCode, auThor,name;
    private double price;
    public Book() {
        super();
    }

    public Book(String bookCode, String auThor, String name, double price) {
        this.bookCode = bookCode;
        this.auThor = auThor;
        this.name = name;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuThor() {
        return auThor;
    }

    public void setAuThor(String auThor) {
        this.auThor = auThor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", auThor='" + auThor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}