package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Số nguyên tố phải lớn hơn 1
        }
        
        // Kiểm tra các số từ 2 đến căn bậc 2 của số để tìm ước
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Nếu chia hết cho bất kỳ số nào thì không phải số nguyên tố
            }
        }
        
        return true;  // Nếu không tìm thấy ước nào khác ngoài 1 và chính nó thì là số nguyên tố
    }
}
