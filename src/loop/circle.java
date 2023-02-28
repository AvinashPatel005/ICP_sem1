package loop;

public class circle {
    public static int circle(int x,int r){
        int y=r+(int)Math.sqrt(Math.pow(r,2)-Math.pow(x-r,2));
        return y;
    }
    public static double area(int r){
        double area = Math.PI*Math.pow(r,2);
        return  area;
    }
    public static double peri(int r){
        double peri = 2*Math.PI*r;
        return peri;
    }
    public static int ellipse(int a,int b){
        int coordinate =0;
        double y=Math.sqrt(a-b)+ Math.sqrt(a+b);
        coordinate = (int)y/10;
        return coordinate;
    }
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(circle(5,5));
        System.out.println(peri(5));
        System.out.println(ellipse(2,8));


        System.out.println(ellipse(7,3));

    }
}
