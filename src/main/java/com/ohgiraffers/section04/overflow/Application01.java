package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 오버플로우에 대해 이헤할 수 있다*/
        /*필기
        *  자료형 별 값의 최대 범위를 벗어나는 경우
        *  발생한 carry를 버림처리 하고 sign bit를 반전시켜 최솟값으로 순환시킴
        *  sign bit 자리를 침범하게 되면 강제로 (+ -)를 반전시킨다.
        *   */

        /*목차. 1. 오버플로우*/
        byte num1= 127;

        System.out.println("num1 : "+ num1);        //127 : byte 의 최대 저장범위

        num1++; // +1 증가

        System.out.println("num1 overflow : " + num1);  // -127 : byte 의 최소 저장범위


        /*목차. 2. 언더플로우*/
        /*필기. 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.*/
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--;

        System.out.println("num2 underfolw :"+ num2);

        int firstNum = 1000000; // 100만
        int secondNum = 700000; // 70만

        int multi = firstNum * secondNum;

        System.out.println("firstNum * SecondNum : " + multi);

        // 값의 저장범위를 넘어감 그래서 다른계산 값이 나옴
        // 4바이트를 초과한 값 더 큰 자료형이 필요


        /*목차. 3. 해결방법*/
        /*필기
        *   오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.*/

        long longMulti = firstNum * secondNum; // 7천억이 나와야함 인트는 이만큼 수를 담을 수 없다
        System.out.println("longMulti : " + longMulti); // 이것도 안됨 왜냐면 아직 인트 값으로 지정되어 있어서이다.

        long result =(long) firstNum * secondNum; //  형변환이다. 지정한 범위를 벗어나면 큰 자료형이 필요하다는 생각을 필요로 함
        System.out.println("result : " + result); // 큰 자료형을 한 번에 써도 좋지만 메모리가 낭비되지 않도록 형에 맞게 사용하면 좋다.



        /*목차. 1-1*/
    }
}
