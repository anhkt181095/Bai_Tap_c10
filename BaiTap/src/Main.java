import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array book = new Array();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Thêm");
            System.out.println("2. Tổng tiền");
            System.out.println("3. Tìm kiếm");
            System.out.println("Chọn : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    book.add();
                    break;
                case 2:
                    book.sum();
                    break;
                case 3:

            }
        } while (true);
    }
}
