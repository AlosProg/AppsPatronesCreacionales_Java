package clases;

/*CLASE ABSTRACTA DEL CONSTRUCTOR
 */
public abstract class Constructor {
    protected Robot robot; // Se crea agregación del robot

    public Robot obtenerRobot() { // método que devolverá un robot
        return robot;
    }
    
    public void hacerNuevoRobot(){ // se crea instancia de robot
        robot = new Robot();
        
    }
    // Metodos abstractos para construir el robot que serán implementados por clases concretas
    public abstract void constCuerpo();
    public abstract void constBrazos();
    public abstract void constPiernas();
    
    
}
