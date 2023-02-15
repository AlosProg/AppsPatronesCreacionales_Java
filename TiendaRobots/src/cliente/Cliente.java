package cliente;

import clases.*;

/*CLASE CLIENTE
 */
public class Cliente {
    public static void main(String[] args) {
        Director director = new Director(); // se crea instancia un nuevo Director
        director.ponerConstructor(new RobotIndustrial()); //el director contrata al constructor para hacer un robot industrial
        director.construirRobot(); // el director manda construir el robot
        director.obtenerRobot().mostrarRobot(); // el director obtiene el robot y lo muestra al cliente
    }
    
}
