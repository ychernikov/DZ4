/**
 * Created by admin on 2/27/2018.
 */
public class Kvadrat {
    private final int storona=0;
    protected static int squeKvadrt(int storona){
        return storona*storona;
    }
    protected static int perimKvadrat(int storona){
        return storona*4;
    }
    @Override
    public String toString(){
        return String.valueOf(System.out.printf("Квадрат со стороной a%n"));
    }
}
