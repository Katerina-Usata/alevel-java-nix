package com.alevel.java.nix.module1;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //  \[S = \frac{1}{2}\left| {(x_2 - x_1 )(y_3 - y_1 ) - (x_3 - x_1 )(y_2 - y_1 )} \right|.\]

        Point A = new Point(2, 12);
        Point B= new Point(7,8);
        Point C= new Point(7,6);

        int one=B.getX()-A.getX();
        int two=C.getY()-A.getY();
        int res=one*two;
        int tree=C.getX()-A.getX();
        int four=B.getY()-A.getY();
        int res2=tree*four;
        int res3=res-res2;
        int res4=res3/2;

        if(res4<0)
        {
            int  area=res4*(-1);
            System.out.println(area);
        }
    }

    static  class Point {

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
