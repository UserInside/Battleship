public class DoubleTubeShip extends Ship {
    private final int size = 2;
    public Field field;

    public DoubleTubeShip(Field f, Point p1, Point p2) {
        this.field = f;

        int x1 = p1.getX();
        int y1 = p1.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        if ((Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 0) || (Math.abs(x2 - x1) == 0 && Math.abs(y2 - y1) == 1)) {  //TODO поправить условие. кривое


            if (x2 == x1) { //корабль вертикальный
                for (int i = x1 - 1; i < x1 + 2; i++) {
                    for (int j = y1 - 1; j < y2 + 2; j++) {
                        if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                            field.field[i][j] = 1;  //устанавливаем ореол
                        }
                    }
                }
            }
            if (y2 == y1) { //корабль горизонтальный                  //TODO добавить проверку когда х2 меньше х1
                for (int i = x1 - 1; i < x2 + 2; i++) {
                    for (int j = y1 - 1; j < y1 + 2; j++) {
                        if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                            field.field[i][j] = 1;  //устанавливаем ореол
                        }
                    }
                }
            }

            field.field[x1][y1] = 2;    //устанавливаем корабль
            field.field[x2][y2] = 2;    //устанавливаем корабль

        } else {
            System.out.println("При создании корабля требуется указывать соседние клетки");
        }
    }

}




