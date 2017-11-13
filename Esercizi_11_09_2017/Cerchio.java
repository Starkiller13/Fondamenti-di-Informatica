import java.lang.Math;

public class Cerchio {
    /*
       Construttore della classe Cerchio: centro (x,y) e raggio
    */
    public Cerchio(double x, double y, double radius) {
        this.pos_x = x;
        this.pos_y = y;
        this.radius = radius;
    }

    /*
       Verifica se questo cerchio e il cerchio c sono coincidenti, 
       ovvero se hanno tutti i punti in comune
    */

    public boolean isCoincident(Cerchio c) {
        if (this.pos_x == c.pos_x && this.pos_y == c.pos_y && Math.abs(this.radius - c.pos_x) < ERRORE)
            return true;
        else
            return false;
    }

    /*
       verifica se questo cerchio e' interno al cerchio c o se
       il cerchio c e' interno a questo cerchio
    */
    public boolean isEncircled(Cerchio c) {
        if (Math.pow(this.pos_x - c.pos_x, 2) + Math.pow(this.pos_y - c.pos_y, 2) < Math.pow(this.radius - c.radius, 2))
            return true;
        else
            return false;
    }

    /*
      verifica se questo cerchio e il cerchio c sono esterni, ovvero non
      sono contenuti uno nell'altro e non hanno alcun punto in comune
    */
    public boolean isExternal(Cerchio c) {
        if (Math.pow(this.pos_x - c.pos_x, 2) + Math.pow(this.pos_y - c.pos_y, 2) > Math.pow(this.radius + c.radius, 2))
            return true;
        else
            return false;
    }

    /*
      verifica se questo cerchio e il cerchio c sono secanti, 
      ovvero se hanno almeno un punto in comune.
    */
    public boolean isSecant(Cerchio c) {
        if (Math.pow(this.pos_x - c.pos_x, 2) + Math.pow(this.pos_y - c.pos_y, 2) < Math.pow(this.radius + c.radius, 2)
                && !c.isEncircled(this) && !this.isEncircled(c))
            return true;
        else
            return false;
    }

    /*
      Verifica se questo cerchio e il cerchio c sono tangenti,
      ovvero se hanno un solo punto in comune
    */
    public boolean isTangential(Cerchio c) {
        if (Math.abs(Math.pow(this.pos_x - c.pos_x, 2) + Math.pow(this.pos_y - c.pos_y, 2)
                - Math.pow(this.radius + c.radius, 2)) < ERRORE)
            return true;
        else
            return false;
    }

    private double pos_x;
    private double pos_y;
    private double radius;
    final double ERRORE = 1E-14;

}