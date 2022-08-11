
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Field {
    public final int[][] field = new int[10][10];


    public Field createOneTubeShip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи координаты Однопалубного корабля в формате х,у)");

        String[] cell = input.nextLine().split(",");
        int x = Integer.parseInt(cell[0]);
        int y = Integer.parseInt(cell[1]);

        Point p = new Point(this, x, y);

        SingleTubeShip singleTubeShip = new SingleTubeShip(this, p);

        return singleTubeShip.field;
    }

    public Field createDoubleTubeShip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи координаты Двухпалубного корабля в формате х,у;x,y)");

        String[] cells = input.nextLine().split(";");

        List<Point> coordinates = new ArrayList<>();
        for (String cell : cells) {
            String[] x = cell.split(",");
            coordinates.add(new Point(this, Integer.parseInt(x[0]), Integer.parseInt(x[1])));

        }

        DoubleTubeShip doubleTubeShip = new DoubleTubeShip(this, coordinates.get(0), coordinates.get(1));

        return doubleTubeShip.field;
    }

    public Field createTripleTubeShip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи координаты Трёхпалубного корабля в формате х,у;x,y;x,y)");

        String[] cells = input.nextLine().split(";");

        List<Point> coordinates = new ArrayList<>();
        for (String cell : cells) {
            String[] x = cell.split(",");
            coordinates.add(new Point(this, Integer.parseInt(x[0]), Integer.parseInt(x[1])));

        }

        TripleTubeShip tripleTubeShip = new TripleTubeShip(this, coordinates.get(0), coordinates.get(1), coordinates.get(2));

        return tripleTubeShip.field;
    }

    public Field createQuadroTubeShip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи координаты Трёхпалубного корабля в формате х,у;x,y;x,y)");

        String[] cells = input.nextLine().split(";");

        List<Point> coordinates = new ArrayList<>();
        for (String cell : cells) {
            String[] x = cell.split(",");
            coordinates.add(new Point(this, Integer.parseInt(x[0]), Integer.parseInt(x[1])));

        }

        QuadroTubeShip quadroTubeShip = new QuadroTubeShip(this, coordinates.get(0), coordinates.get(1), coordinates.get(2), coordinates.get(3));

        return quadroTubeShip.field;
    }





    public String toString() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
        return null;
    }



}








//    public void createBattleship() {
//        Scanner ship4 = new Scanner(System.in);
//        System.out.println("Введи координаты Линкора (четырехпалубного корабля в формате х,у;х,у;х,у;х,у)");
//
//        String[] cells = ship4.nextLine().split(";");
//        List<Point> coordinates = new ArrayList<>();
//        for (String cell : cells) {
//            String[] x = cell.split(",");
//            coordinates.add(new Point(Integer.parseInt(x[0]), Integer.parseInt(x[1])));
//            field[Integer.parseInt(x[0])][Integer.parseInt(x[1])] = 1;
//        }
//        Battleship battleship = new Battleship(coordinates.get(0), coordinates.get(1), coordinates.get(2), coordinates.get(3));
//        //TODO разместить корабль на поле
//    }