
package clases;

/*Esta clase hereda de clase abstracta Reloj e implementa su método
 */
public class RelojMac extends Reloj {
    private final String nombre = "Reloj Mac RM";
    private final int precio = 300;
    @Override
    public void mostrarPedido() {
        System.out.println("El nombre del reloj es: " + nombre + " y su valor es de: " + precio + " Euros");
    }
}
