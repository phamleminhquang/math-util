package com.minhquang.mathutil.tester;

import com.minhquang.mathutil.core.MathUtility;

import java.sql.SQLOutput;

import static com.minhquang.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // XÀI THỬ HÀM TÍNH GIAI THỪA
        System.out.println("5! = " + MathUtility.getFactorial(5));
        System.out.println("6! = " + MathUtility.getFactorial(6));


       // testGetFactorialGivenRightArg1RunsWell();
       // testGetFactorialGivenRightArg0RunsWell();
       // testGetFactorialGivenRightArg5RunsWell();
        // testGetFactorialGivenWrongArgMinus5ThrowsException();
        // testGetFactorialGivenWrongArgMinus25ThrowsException();
    }
    // TEST CASE #5:
    // DESC: CHECK GETF() WITH BOUNDARY NUMBER, E.G. N = 25
    // STEP: N = 25
    //      CALL GETF(N 25 )
    // EXPECTED: 1 NGOAI LỆ PHẢI XUẤT HIỆN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KHÔNG TÍNH ĐƯỢC
    // KHÔNG CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                            THROW NEW IllegalArgumentException("câu thông báo lỗi")
    // STATUS:
    public static void testGetFactorialGivenWrongArgMinus25ThrowsException(){
        System.out.println( "25! Actual: Exception; Actual: ");
        getFactorial(25);

    }

    // TEST CASE #4:
    // DESC: CHECK GETF() WITH BOUNDARY NUMBER, E.G. N = -5
    // STEP: N = -5
    //      CALL GETF(N -5 )
    // EXPECTED: 1 NGOAI LỆ PHẢI XUẤT HIỆN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KHÔNG TÍNH ĐƯỢC
    // KHÔNG CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                            THROW NEW IllegalArgumentException("câu thông báo lỗi")
    // STATUS:
    public static void testGetFactorialGivenWrongArgMinus5ThrowsException() {
        System.out.println("-5! Actual: Exception; Actual: ");
        getFactorial(-5);
    }

    // thấy ngoại lệ khi đưa n = -5 => hàm mlem nới -5 => CODE ĐÚNG
        // đúng vì -5 phải ném ra ngoại lệ

    // TEST CASE #3:
    // DESC: CHECK GETF() WITH BOUNDARY NUMBER, E.G. N = 5
    // STEP: N = 5
    //      CALL GETF(N)
    // EXPECTED: 120 AS RESULT OF 5!
    // STATUS:
    public static void testGetFactorialGivenRightArg5RunsWell(){
        int n = 5;
        long expected = 120; // 0! hy vọng là 1, còn thực tết thì
        long actual;   // gọi hàm mới tính đc
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }
    // TEST CASE #2:
    // DESC: CHECK GETF() WITH BOUNDARY NUMBER, E.G. N = 1
    // STEP: N = 1
    //      CALL GETF(N)
    // EXPECTED: 1 AS RESULT OF 1!
    // STATUS:
    public static void testGetFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1; // 0! hy vọng là 1, còn thực tết thì
        long actual;   // gọi hàm mới tính đc
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }
    public static void testGetFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1; // 0! hy vọng là 1, còn thực tết thì
        long actual;   // gọi hàm mới tính đc
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }

}




// Test case #1: ( CÂU SÔ 2, CÂU SỐ 3 LÀ VIẾT TEST CASE ĐÓ)
// ID, TEST CASE DESCRIPTION | DATA | STEPS | PROCEDURE | EXPECTED RESULT | RESULT | STATUS (PASSED|FAILED) | TEST NAME | TEST BY
//ID     | DESC             | DATA      | STEPS         | EXPECTED RESULT