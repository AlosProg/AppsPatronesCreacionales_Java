
package clases;

/*Esta clase hereda de clase abstracta Movil e implementa su método
 */
public class MovilMac extends Movil {
    private final String nombre = "Movil Mac MM";
    private final int precio = 700;
    @Override
    public void mostrarPedido() {
        System.out.println("El nombre del movil es: " + nombre + " y su valor es de: " + precio + " Euros");
    }
}
