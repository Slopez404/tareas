import java.util.Scanner;


public class Principal {
    public static void main(String [] args) {
 
        Comprador comprador = new Comprador ("Nissan", "Almera", 1998, 17000000, 78654322, 17000000); 
        
        comprador.mostrarCompra();
   Scanner entrada=new Scanner(System.in);

      System.out.print("Escriba la base: ");
      int base=entrada.nextInt();

      System.out.print("Escriba el exponente de la base a operar: ");
      int exponente=entrada.nextInt();

      int resultado = Potencia(base,exponente);
      System.out.println(resultado);

    }

      public static int Potencia(int base, int exponente){
         if(exponente==0){
            return 1;
         }else{
            return base*Potencia(base,exponente-1);
         }
      
   }
 }

 
 
