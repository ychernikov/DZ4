/**
 * Created by admin on 2/27/2018.
 */
public class Krug {
    static final double P= 3.14;
    double radius;
    protected static double dlinaKruga(int radius){
        return 2*P*radius;
    }
    protected static double squeKruga(int radius){
        return P*radius*radius;
    }
    @Override
    public String toString(){
        return String.valueOf(System.out.printf("Круг с радиусом r%n"));
    }
}
