/**
 * Created by admin on 2/27/2018.
 */
public class Treugl {
    private final double storonaA=0;
    private final double storonaB=0;
    private final double storonaC=0;
    protected static double PerimetrTreug(double storonaA, double storonaB, double storonaC){
        return storonaA+storonaB+storonaC;
    }
    protected static double squeTreug(double storonaA, double storonaB, double storonaC){
        Treugl per=new Treugl();
        double p2=(storonaA+storonaB+storonaC)/2;
        double sque=Math.sqrt(p2*(p2-storonaA)*(p2-storonaB)*(p2-storonaC)) ;
        return sque;
    }
    @Override
    public String toString(){
        return String.valueOf(System.out.printf("Треугольник со сторонами a, b, c%n"));
    }
}


