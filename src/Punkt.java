/**
 * Created by Robert Burek
 */
public class Punkt {

    private int x,y;

    public Punkt(){
        ustawWspolrzedne(320,200);
    }

    private void ustawWspolrzedne(int wspX, int wspY) {
        this.x=wspX;
        this.y=wspY;
    }

    private void pobierzWspolrzedne(Punkt punkt) {
        punkt.x=x;
        punkt.y=y;
    }

    Punkt pobierzWspolrzedne() {
        Punkt punkt = new Punkt();
        punkt.x=x;
        punkt.y=y;
        return punkt;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
