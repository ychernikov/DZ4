/**
 * Created by admin on 2/27/2018.
 */
public class Rektangle {
    private final int storonaA=0;
    private final int storonaB=0;
    protected static int squeRek(int storonaA, int storonaB){
        return storonaA*storonaB;
    }
    protected static int perimRek(int storonaA, int storonaB){
        return (storonaA+storonaB)*2;
    }
    @Override
    public String toString(){
        return String.valueOf(System.out.printf("Прямоугольник со сторонами a и b%т"));
    }
}
