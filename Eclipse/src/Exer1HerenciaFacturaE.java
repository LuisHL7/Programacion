/**
 * 
 * Exercicio 1:
 * 
 * Cree una clase de factura que descienda de la siguiente clase
 * precio, que incluye dos atributos espec�ficos llamados 
 * remitente y cliente (num�rico) y un m�todo llamado 
 * imprimirFactura Escribir un ejemplo del uso de la clase 
 * Factura con una llamada a alg�n m�todo heredado.
 * 
 * @author a19luisjhl
 *
 */
public class Exer1HerenciaFacturaE {

	public static void main(String[] args) {
		
		Factura Factura1 = new Factura();
		Precio Precio1 = new Precio();
		Factura1.setEmisor(521);
		Factura1.setCliente(250);
		Factura1.pon(500);
		Precio1.setEuros(125);
		System.out.println("Euros: " + Precio1.da());
		Factura1.imprimirFactura();

	}

}
