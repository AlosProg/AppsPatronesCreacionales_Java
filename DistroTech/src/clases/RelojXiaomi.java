
package clases;

/*Esta clase hereda de clase abstracta Reloj e implementa su método
 */
public class RelojXiaomi extends Reloj {
    private final String nombre = "Reloj Xiaomi RX";
    private final int precio = 150;
    @Override
    public void mostrarPedido() {
        System.out.println("El nombre del reloj es: " + nombre + " y su valor es de: " + precio + " Euros");
    }
}
