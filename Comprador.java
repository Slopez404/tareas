 public class Comprador extends Carro  { 
  private int documentoComprador; 
  private int dineroEntregado; 

  public Comprador(String marca, String modelo, int temporada, int precio, int documentoComprador, int dineroEntregado) { 
    super(marca, modelo, temporada, precio); 
    this.documentoComprador = documentoComprador; 
    this.dineroEntregado = dineroEntregado; 


  }

  public void mostrarCompra() {
     System.out.println("Marca del vehículo vendido: "+getMarca()+
             "\nModelo: "+getModelo()+
             "\nTemporada: "+getTemporada()+
             "\nPrecio: "+getPrecio()+
             "\nNúmero de documento del comprador: "+documentoComprador+
             "\nDinero entregado por el comprador: "+dineroEntregado);

 }

} 
