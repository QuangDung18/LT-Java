public class LietKeNSoNguyenTo {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Số nhỏ hơn 2 không phải là số nguyên tố
        }
        // Kiểm tra các số chia hết từ 2 đến căn bậc hai của num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Nếu chia hết thì không phải số nguyên tố
            }
        }
        return true;
    }

    // Hàm liệt kê n số nguyên tố đầu tiên
    public static void lietkeSoNguyenToDauTien(int n) {
        System.out.println("Liệt kê " + n + " số nguyên tố đầu tiên:");
        int count = 0;  // Đếm số lượng số nguyên tố đã tìm thấy
        int num = 2;    // Bắt đầu kiểm tra từ số 2 (số nguyên tố nhỏ nhất)

        // Liệt kê cho đến khi tìm đủ n số nguyên tố
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;  // Tăng số lượng số nguyên tố đã tìm thấy
            }
            num++;  // Tăng giá trị số cần kiểm tra
        }
    }

    public static void main(String[] args) {
        // Kiểm tra với giá trị n
        int n = 20;  // Ví dụ: Liệt kê 10 số nguyên tố đầu tiên
        lietkeSoNguyenToDauTien(n);
    }
}
