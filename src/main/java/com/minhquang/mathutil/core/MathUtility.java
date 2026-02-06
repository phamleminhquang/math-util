package com.minhquang.mathutil.core;

// đây là thư viện toán học, mô phỏng giống thư viện chuẩn math, của JDK
// các thư viện mang tính tiện ích, đồ dùng xài chung cho các nơi, cung cấp các tool nhỏ nhỏ thì ta sẽ thiết kế các hàm là stactic!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


public class MathUtility {
    // hàm tính giai thửa n! = 1.2.3...n
    // ko giai thừa số âm
    // 20! vừa đủ kiểu long - 18 con số 0, 21! kiểu long chứa không nổi
    // 0! = 1
    // khai báo biến mà không gán value là 1 bug
    public static long getFactorial(int n) {
        long result;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n mus be between 0 and 20");
        }
        if (n == 0) {
            return 1;
        }
        result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }

}
