import java.util.Scanner;

/**
 * Created by admin on 2/27/2018.
 */
public class Figura {
    private int figuraIndex;
    public  Figura (int figuraIndex) {
        this.figuraIndex=figuraIndex;
    }

    public static double createFigura(int figuraName){
        if (figuraName==1) {
            System.out.printf("Вы выбрали Квадрат.%nВведите длинну стороны: ");
            Scanner figura = new Scanner(System.in);
            int storona = figura.nextInt();
            Kvadrat kvadrat = new Kvadrat();
            System.out.println(kvadrat.toString());
            int sque = kvadrat.squeKvadrt(storona);
            int per = kvadrat.perimKvadrat(storona);
            System.out.printf("Квадрат со стороной %d, имеет площадь %d и периметр %d", storona, sque, per);
        }
        if (figuraName==2) {
            System.out.printf("Вы выбрали Прямоугольник.%nВведите длинну боковой грани: ");
            Scanner figura = new Scanner(System.in);
            int storonaA = figura.nextInt();
            System.out.printf("Введите длинну верхней грани: ");
            int storonaB = figura.nextInt();
            Rektangle rektangle = new Rektangle();
            System.out.println(rektangle.toString());
            int sque = rektangle.squeRek(storonaA, storonaB);
            int perim = rektangle.perimRek(storonaA, storonaB);
            System.out.printf("Прямоугольник со сторонами %d, %d имеет площадь %d и периметр %d", storonaA, storonaB, sque, perim);
        }
        if (figuraName==3) {
            System.out.printf("Вы выбрали Круг.%nВведите длинну радиуса: ");
            Scanner figura = new Scanner(System.in);
            int radius = figura.nextInt();
            Krug krug = new Krug();
            System.out.println(krug.toString());
            double sque = krug.squeKruga(radius);
            double perim = krug.dlinaKruga(radius);
            System.out.printf("Круг с радиусом %s, имеет площадь %s и длинну окружности %s", radius, sque, perim);
        }
        if (figuraName==4) {
            System.out.printf("Вы выбрали Треугольник.%nВведите длинну стороны а: ");
            Scanner figura = new Scanner(System.in);
            double storonaA = figura.nextDouble();
            System.out.printf("%nВведите длинну стороны b: ");
            double storonaB = figura.nextDouble();
            System.out.printf("%nВведите длинну стороны c: ");
            double storonaC = figura.nextDouble();
            Treugl treugl = new Treugl();
            System.out.println(treugl.toString());
            double sque = treugl.squeTreug(storonaA, storonaB, storonaC);
            double perim = treugl.PerimetrTreug(storonaA, storonaB, storonaC);
            System.out.printf("Треугольник со сторонами %s, %s, %s имеет площадь %s и периметр %s %n", storonaA, storonaB, storonaC, sque, perim);
        }
       // if (figuraName==5)
        return 0;
     }

}
