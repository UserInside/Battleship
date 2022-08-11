public class TripleTubeShip {
    private final int size = 3;
    public Field field;

    public TripleTubeShip(Field f, Point p1, Point p2, Point p3) {
        this.field = f;

        int x1 = p1.getX();
        int y1 = p1.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        int x3 = p3.getX();
        int y3 = p3.getY();

        if ((Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 0 && Math.abs(x3 - x2) == 1 && Math.abs(y3 - y2) == 0) ||
                (Math.abs(x2 - x1) == 0 && Math.abs(y2 - y1) == 1 && Math.abs(x3 - x2) == 0 && Math.abs(y3 - y2) == 1)) {

            if (x3 == x1) { //корабль вертикальный
                for (int i = x1 - 1; i < x1 + 2; i++) {
                    for (int j = y1 - 1; j < y3 + 2; j++) {
                        if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                            field.field[i][j] = 1;  //устанавливаем ореол
                        }
                    }
                }
            }
            if (y3 == y1) { //корабль горизонтальный
                for (int i = x1 - 1; i < x3 + 2; i++) {
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

        } else {
            System.out.println("При создании корабля требуется указывать соседние клетки");
        }
    }

}
