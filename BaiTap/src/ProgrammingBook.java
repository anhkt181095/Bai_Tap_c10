
public class ProgrammingBook extends Book{
    private String language;
    private String framwork;
    public ProgrammingBook(){
        super();
    }
    public ProgrammingBook(String language, String framwork) {
        this.language = language;
        this.framwork = framwork;
    }

    public ProgrammingBook(String bookCode, String auThor, String name, double price, String language, String framwork) {
        super(bookCode, auThor, name, price);
        this.language = language;
        this.framwork = framwork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramwork() {
        return framwork;
    }

    public void setFramwork(String framwork) {
        this.framwork = framwork;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framwork='" + framwork + '\'' +
                '}' + toString();
    }
}
