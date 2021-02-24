/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1herenciafacturan;

/**
 *
 * @author Santi
 */
public class Exer1HerenciaFacturaN {

    public static void main(String[] args) {
        Factura Factura1 = new Factura();
        Prezo Precio1 = new Prezo();
        Factura1.setEmisor(521);
        Factura1.setCliente(250);
        Factura1.pon(500);
        Precio1.setEuros(125);
        System.out.println("Euros: " + Precio1.da());
        Factura1.imprimirFactura();
    }

}
