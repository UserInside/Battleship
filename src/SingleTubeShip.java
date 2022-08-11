
public class SingleTubeShip extends Ship{
    private final int size = 1;
    public Field field;

    public SingleTubeShip(Field f, Point p1) {
        this.field = f;

        int x = p1.getX();
        int y = p1.getY();

        for (int i = x-1; i < x+2; i++) {
            for (int j = y-1; j < y+2; j++) {
                if (0 <= i && i <= 9 && 0 <= j && j <= 9) {
                    field.field[i][j] = 1;  //устанавливаем ореол
                }
            }
        }
        field.field[x][y] = 2;    //устанавливаем корабль

    }



}
