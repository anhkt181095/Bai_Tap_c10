public class FictionBook extends Book{
    private String category;
    public FictionBook(){
        super();
    }
    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String auThor, String name, double price, String category) {
        super(bookCode, auThor, name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
//"Quyển 1,"CodeGym1","PyThon",120000,"Lập trình"