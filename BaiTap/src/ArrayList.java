import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Book books = new Book();
    ProgrammingBook [] programmingBooks = new ProgrammingBook[5];
    FictionBook [] fitionBooks = new FictionBook[5];
    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Array{" +
                "books=" + books +
                ", programmingBooks=" + Arrays.toString(programmingBooks) +
                ", fitionBooks=" + Arrays.toString(fitionBooks) +
                '}';
    }

    public void add (){
        ProgrammingBook programmingBook1 = new ProgrammingBook ("Sach1","CodeGym1","Java",1000,"Tiếng Việt","CD1");
        programmingBooks[0] = programmingBook1;
        ProgrammingBook programmingBook2 = new ProgrammingBook ("Sach2","CodeGym2","Java",2000,"Tiếng Việt","CD2");
        programmingBooks[1] = programmingBook2;
        ProgrammingBook programmingBook3 = new ProgrammingBook ("Sach3","CodeGym3","Java",3000,"Tiếng Việt","CD3");
        programmingBooks[2] = programmingBook3;
        ProgrammingBook programmingBook4 = new ProgrammingBook ("Sach4","CodeGym4","Java",4000,"Tiếng Việt","CD4");
        programmingBooks[3] = programmingBook4;
        ProgrammingBook programmingBook5= new ProgrammingBook ("Sach5","CodeGym5","Java",5000,"Tiếng Việt","CD5");
        programmingBooks[4] = programmingBook5;

        FictionBook fictionBook1 = new FictionBook("Quyển 1","CodeGym1","PyThon",1000,"Lập trình1");
        fitionBooks[0] = fictionBook1;
        FictionBook fictionBook2 = new FictionBook("Quyển 2","CodeGym1","PyThon",2000,"Lập trình2");
        fitionBooks[1] = fictionBook2;
        FictionBook fictionBook3 = new FictionBook("Quyển 3","CodeGym1","PyThon",3000,"Lập trình3");
        fitionBooks[2] = fictionBook3;
        FictionBook fictionBook4 = new FictionBook("Quyển 4","CodeGym1","PyThon",4000,"Lập trình4");
        fitionBooks[3] = fictionBook4;
        FictionBook fictionBook5 = new FictionBook("Quyển 5","CodeGym1","PyThon",5000,"Lập trình5");
        fitionBooks[4] = fictionBook5;
    }
    public void sum() {
        float tongTienPro= 0;
        float tongTienFic = 0;
        float tongtien = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
            tongTienPro += programmingBooks[i].getPrice();
        }
        for (int i = 0; i < fitionBooks.length; i++) {
            tongTienFic += fitionBooks[i].getPrice();
        }
        tongtien = tongTienPro+ tongTienFic;
        System.out.println("Tổng tiền là: " + tongtien + "VND");
    }
    public void show(){

    }
}
