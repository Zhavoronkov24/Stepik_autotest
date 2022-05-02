package org.zhavoronkov.traingle;

public class Calculation {

    public static void main(String[] args) {

    }

    public int formula (int a, int b) throws MyException {
        if (a<0 || b<0) throw new MyException("Неправильный треугольник");
        int result = (a * b) / 2;
        return result;
    }


}
