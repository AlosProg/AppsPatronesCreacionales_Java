
package clases;

/*Clase que implementará los métodos de la clase interfaz FactoriaDispositivos
haciendo pedidos solo de productos Mac
 */
public class FactoriaMac implements FactoriaDispositivos {

    @Override
    public Movil crearPedidoMovil() {
        return new MovilMac();
    }

    @Override
    public Reloj crearPedidoReloj() {
        return new RelojMac();
    }
}
