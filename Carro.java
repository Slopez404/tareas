public class Carro {
    private String marca; 
   private String modelo;
   private int temporada; 
   private int precio; 
 
   public Carro(String marca, String modelo, int año, int precio) { 
       this.marca = marca; 
       this.modelo = modelo; 
       this.temporada = temporada;
       this.precio = precio; 
   }

   public String getMarca () { 
       return marca;
   }

   public String getModelo () { 
       return modelo;
   }
   
   public int getTemporada () { 
       return temporada;
   }

   public int getPrecio () {
       return precio;
   }
}
