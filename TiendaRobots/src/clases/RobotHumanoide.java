package clases;

/*CONSTRUCTOR CONCRETO DE ROBOT TIPO HUMANOIDE
 */
public class RobotHumanoide extends Constructor { // Implementación de los métodos de la clase abstracta Constructor
    @Override
    public void constCuerpo() {
       robot.ponerCuerpo("plastico");
    }

    @Override
    public void constBrazos() {
       robot.ponerBrazos("brazos humanos");
    }

    @Override
    public void constPiernas() {
       robot.ponerPiernas("bípedo");
    }
}
