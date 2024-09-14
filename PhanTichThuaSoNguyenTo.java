public class PhanTichThuaSoNguyenTo {

    // Hàm phân tích số nguyên n thành các thừa số nguyên tố
    public static void phanTichThuaSoNguyenTo(int n) {
        System.out.print("Phân tích " + n + " thành các thừa số nguyên tố: ");
        
        // Bắt đầu kiểm tra các thừa số nguyên tố từ 2
        int i = 2;
        while (n > 1) {
            // Nếu n chia hết cho i, thì i là thừa số nguyên tố
            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i; // Chia n cho i để tiếp tục quá trình
            } else {
                i++; // Tăng i để kiểm tra số tiếp theo
            }
        }
        System.out.println(); // Xuống dòng sau khi hoàn thành việc phân tích
    }

    public static void main(String[] args) {
        // Kiểm tra với giá trị n
        int n = 56;  // Ví dụ: phân tích 56 thành các thừa số nguyên tố
        phanTichThuaSoNguyenTo(n);
        
        // Kiểm tra với số khác
        n = 315;
        phanTichThuaSoNguyenTo(n);
    }
}
