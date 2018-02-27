import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.Scanner;

/**
 * Created by admin on 2/27/2018.
 */
public class MakeFigura {

    public static void showMenu() {

        System.out.printf("Выберите фигуру:%n1. Квадрат%n2. Прямоугольник%n3. Круг%n4. Треугольник%n5. Выход%n");
        Scanner figura = new Scanner(System.in);
        int indexFigura = figura.nextInt();
        Figura f = new Figura(indexFigura);
        f.createFigura(indexFigura);
    }

    public static void main(String[] args) {
        MakeFigura f = new MakeFigura();
        f.showMenu();
    }
}
