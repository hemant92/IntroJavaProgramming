package ChapterOne;

public class ApproximatePie {
    public static void main(String[] args) {
        double pie, valueOne;
        pie = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7)+ (1.0/9) - (1.0/11));
        valueOne  =  4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7)+ (1.0/9) - (1.0/11) + (1.0/13));
        System.out.println(pie);
        System.out.println(valueOne);
    }
}