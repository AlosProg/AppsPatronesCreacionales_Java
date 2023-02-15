package clases;

/*CONSTRUCTOR CONCRETO DE ROBOT TIPO INDISTRIAL
 */
public class RobotIndustrial extends Constructor { // Implementación de los métodos de la clase abstracta Constructor

    @Override
    public void constCuerpo() {
       robot.ponerCuerpo("metal");
    }

    @Override
    public void constBrazos() {
       robot.ponerBrazos("pinzas");
    }

    @Override
    public void constPiernas() {
       robot.ponerPiernas("ruedas");
    }
    
}
