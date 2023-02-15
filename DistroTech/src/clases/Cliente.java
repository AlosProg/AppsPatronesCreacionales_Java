
package clases;

/*Clase Cliente que para hacer pedidos de productos Mac y/o Xiaomi.
En el ejemplo se crea un pedido de productos Mac (una instancia de Mac) y con ese objeto solo podremos hacer
pedidos de esta marca.
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        FactoriaDispositivos pedido = new FactoriaMac(); //se crea pedido (objeto) de dispositivos Mac
        pedido.crearPedidoMovil().mostrarPedido(); // con este objeto hacemos pedido de un movil 
        pedido.crearPedidoReloj().mostrarPedido(); // con este pedido hacemos pedido de un reloj
    }
}



