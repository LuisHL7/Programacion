public class Factura extends Precio{
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
		System.out.println("Emisor: " + emisor);
		System.out.println("Cliente: " + cliente);
		System.out.println("Da: " + euros);
	}

}
