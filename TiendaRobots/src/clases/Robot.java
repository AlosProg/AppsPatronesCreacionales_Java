package clases;

/*CLASE PRODUCTO,Esta clase será utilizada por los contructores concretos dándole valores*/
public class Robot { 
    private String cuerpo = "";
    private String brazos = "";
    private String piernas = "";
    
    public void ponerCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void ponerBrazos(String brazos) {
        this.brazos = brazos;
    }

    public void ponerPiernas(String piernas) {
        this.piernas = piernas;
    }

    public void mostrarRobot(){ // metodo que devolvera por pantalla los componentes del tipo de robot pedido por el cliente
        System.out.println("Cuerpo: " + cuerpo + "\nBrazos: " + brazos +"\nPiernas: " + piernas);
    }
}
