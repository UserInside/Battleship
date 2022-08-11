public class Point {
    private final int x;
    private final int y;

    public Point(Field f, int x, int y) {
        this.x = x;
        this.y = y;

        if ( x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("Координаты кораблей должны быть от 0 до 9"); //выкинуть ошибку вне поля
        }

        if (f.field[x][y] == 1) {
            System.out.println("Корабль не должен соприкасаться с другим кораблем"); // выкинуть ошибку ("Корабль не должен соприкасаться с другим кораблем")
        }

        if (f.field[x][y] == 2) {
            System.out.println("Клетка занята");   // выкинуть ошибку ("Место занято другим кораблем. Введите другие координаты")
        }
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
