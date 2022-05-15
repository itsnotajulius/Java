public class Areas {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static double area(double radius){
        double answer = radius*radius*Math.PI;
        if(radius<0){
            answer = -1.0;
        }
        return answer;
    }

    public static double area(double x,double y){
        double answer = x*y;
        if(x<0||y<0){
            answer = -1.0;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
}
