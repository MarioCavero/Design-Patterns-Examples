
public class FacadePrinter {

	Impresora i;
	public FacadePrinter(Impresora i) {
		this.i=i;
	}
	public void printPDF(String text) {
		i.setHoja("a4");
		i.setColor(true);
		i.setTipoDocumento("PDF");
		i.setTexto(text);
		i.imprimirDocumento();
	}
}
