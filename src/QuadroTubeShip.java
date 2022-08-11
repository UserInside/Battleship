public class QuadroTubeShip {
    private final int size = 4;
    public Field field;

    public QuadroTubeShip(Field f, Point p1, Point p2, Point p3, Point p4) {
        this.field = f;

        int x1 = p1.getX();
        int y1 = p1.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        int x3 = p3.getX();
        int y3 = p3.getY();

        int x4 = p4.getX();
        int y4 = p4.getY();

        if ((Math.abs(x4 - x3) == 1 && Math.abs(y4 - y3) == 0 && Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 0 && Math.abs(x3 - x2) == 1 && Math.abs(y3 - y2) == 0) ||
                (Math.abs(x4 - x3) == 0 && Math.abs(y4 - y3) == 1 && Math.abs(x2 - x1) == 0 && Math.abs(y2 - y1) == 1 && Math.abs(x3 - x2) == 0 && Math.abs(y3 - y2) == 1)) {

            if (x4 == x1) { //корабль вертикальный
                for (int i = x1 - 1; i < x1 + 2; i++) {
                    for (int j = y1 - 1; j < y4 + 2; j++) {
                        if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                            field.field[i][j] = 1;  //устанавливаем ореол
                        }
                    }
                }
            }
            if (y4 == y1) { //корабль горизонтальный
                for (int i = x1 - 1; i < x4 + 2; i++) {
                    for (int j = y1 - 1; j < y1 + 2; j++) {
                        if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                            field.field[i][j] = 1;  //устанавливаем ореол
                        }
                    }
                }
            }

            field.field[x1][y1] = 2;    //устанавливаем корабль
            field.field[x2][y2] = 2;    //устанавливаем корабль
            field.field[x3][y3] = 2;    //устанавливаем корабль
            field.field[x4][y4] = 2;    //устанавливаем корабль

        } else {
            System.out.println("При создании корабля требуется указывать соседние клетки");
        }

    }
}