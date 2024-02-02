package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*수업목표. 자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 수행할 수 있다.*/
        /*필기.
        *  자동 형변환과 강제 형변환을 이용한 다른 자료끼리의 연산
        *  다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리가 된다.
        *    */

        int inum = 10;
        long lnum = 100;

        // int isum = inum + lnum ;
        int isum =(int) (inum + lnum) ; // 결과값은 롱인데 앞에 인트로 설정했기 때문에 인트로 바꿔준다.

        /*목차. 1. long 형태의 값을 int 형으로 강제 형변환*/

        int isu2 = inum + (int) lnum; // 전체 할 필요 없이 뒤에 있는 롱타입만 형변환을 해준다.

    }
}
