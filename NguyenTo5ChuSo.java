public class NguyenTo5ChuSo {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Số nhỏ hơn 2 không phải số nguyên tố
        }
        // Kiểm tra các số chia hết từ 2 đến căn bậc hai của num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Nếu chia hết thì không phải số nguyên tố
            }
        }
        return true;
    }

    // Hàm liệt kê tất cả các số nguyên tố có 5 chữ số
    public static void lietkeNguyenTo5ChuSo() {
        System.out.println("Các số nguyên tố có 5 chữ số là:");
        // Vòng lặp qua tất cả các số từ 10000 đến 99999
        for (int i = 10000; i <= 99999; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Gọi hàm liệt kê các số nguyên tố có 5 chữ số
        lietkeNguyenTo5ChuSo();
    }
}
