import java.util.Scanner;

public class DemoBuoi1 {
    public static void main(String[] arg) {
//        Scanner scanner=new Scanner(System.in);
//        String inputData = scanner.next();
//        System.out.printf("Test "+ inputData);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào điểm trung bình: ");
        int diemToan = scanner.nextInt();
        if (diemToan >= 9 && diemToan <= 10) {
            System.out.printf("Giỏi");
        } else if (diemToan >= 8) {
            System.out.printf("Khá");

        } else if (diemToan >= 7) {
            System.out.printf("Tiên Tiến");
        } else if (diemToan >= 5) {
            System.out.printf("Trung Bình");
        } else System.out.printf("Yếu");
    }


}
