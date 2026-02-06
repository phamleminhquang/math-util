package com.minhquang.mathutil.core;

import org.junit.jupiter.api.Test;

import java.sql.SQLDataException;

import static com.minhquang.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {


    @Test
    public void testFactorialGivenWrongArgMinus5ThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }

    @Test
    public void testFactorialGivenWrongArgMinus25ThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(25);});
    }

    @Test
    public  void testGetFactorialGivenRightArg5RunsWell() {
        assertEquals(120, getFactorial(5));
    } // 5! có trả về 120 hay ko

    @Test
    public  void testGetFactorialGivenRightArg1RunsWell() {
        assertEquals(1, getFactorial(1));
    }  // 1! có trả về 1 hay ko
    // framework: ép phải viết code theo 1 quy tắc, cấu trúc thì mới run
    @Test
    public  void testGetFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; // 0! hy vọng là 1, còn thực tết thì
        long actual;   // gọi hàm mới tính đc
        actual = getFactorial(n);

        assertEquals(expected, actual); // hàm so sánh này của thư viện JUnit Juputer
        // sẽ so sánh hai đại lượng, nếu bằng nhau  thì ném ra màu xanh nếu khác biệt ném màu đỏ
        // xanh đỏ đẻ passed failed / chuẩn thế giới khi test, khi kiểm thử ta dùng 2 màu xanh, đỏ để nói về trạng thái kiểm thử: đèn xanh thông thường, code release
        //    đèn đỏ code bug, dừng lại fix

        //System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }
}