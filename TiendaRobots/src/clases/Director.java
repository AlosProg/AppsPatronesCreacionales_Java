package clases;

/*CLASE DIRECTOR QUE PIDE AL CONSTRUCTOR UN TIPO DE ROBOT
 */
public class Director {
    protected Constructor constructor; // se crea agregación con la clase Constructor

    public void ponerConstructor(Constructor constructor) {
        this.constructor = constructor;
    }
    
    public void construirRobot(){ // Método para que la clase Constructor construya el robot
        constructor.hacerNuevoRobot();
        constructor.constCuerpo();
        constructor.constBrazos();
        constructor.constPiernas();
    }
    
    public Robot obtenerRobot(){ // método que pedirá al Constructor que le entregue el robot
        return constructor.obtenerRobot();
    }
}
