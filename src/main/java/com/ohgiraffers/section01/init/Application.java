package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /*
        * 객체 배열에 대해
        * 객체배열은 레퍼런스 변수에 대한 배열이다.
        * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
        *  */

        // 자동차 5대 인스턴스를 생성한 후 모든 인스턴스가 최고 속도로 달리게 한다.

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("포터", 500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        // 동일한 타입의 인스턴스를 여러 개 사용해야 할 때 객체배열을 이용하면 보다 효율적이다.
        // Car 타입의 인스턴스 주소를 보관 할 5칸 짜리 배열 할당

        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티", 400);
        carArray[4] = new Car("포터", 500);

        for(int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

    }
}
