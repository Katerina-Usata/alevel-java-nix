package com.alevel.java.nix.module1;

public class Chess {
    public static void main(String[] args) {
        Point hours = new Point(3, 1);
        Point place = new Point(5, 2);
        int a = place.getX() - hours.getX();
        int b = place.getY() - hours.getY();
        Point res = new Point(a, b);
        if ((a == 1 & b == 2) | (a == 2 & b == 1) | (a == -1 & b == 2) | (a == -2 & b == 1) | (a == 2 & b == -1) | (a == 1 & b == -2)) {
            System.out.println("Конь может сделать ход");
        } else {
            System.out.println("Вы ошиблись");
        }

    }

    static class Point {

        public Object getX;
        int x, y;            //параметры точки

        Point(int ax, int ay) {   //конструктор
            x = ax;
            y = ay;
        }

        int getX() {
            return x;
        }

        //запрос координаты Y
        int getY() {
            return y;
        }
    }
}
