/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1herenciafacturan;

/**
 *
 * @author Luis Huapaya
 */
public class Factura extends Prezo{
	private int emisor;
	private int cliente;

	public int getEmisor() {
		return emisor;
	}

	public void setEmisor(int emisor) {
		this.emisor = emisor;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public void imprimirFactura() {
		System.out.println("Emisor:" + emisor);
		System.out.println("Cliente:" + cliente);
		System.out.println("Da:" + euros);
		System.out.println("Emisor:");
	}

}

