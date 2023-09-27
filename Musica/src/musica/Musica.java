
package musica;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author LD
 */
public class Musica {


   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String titulo = "Cancion 1";
      String artista = "Artista 1";
      boolean fav = true;
      boolean descarga = false;
      int minutos = 5;
      int segundos = 3;
      Cancion cancion1 = new Cancion(titulo,artista,
              fav,descarga,segundos,minutos);
//      System.out.println(cancion1.mostrarDetalles());
      cancion1.adelantarCancion(30);
//      System.out.println(cancion1.mostrarDetalles());
      Playlist pl01 = new Playlist("Lista 1");
      Playlist pl02 = new Playlist("Lista 2");
      for(int i = 0; i < 3; i++){
         Cancion cancion = new Cancion();
         cancion.setTitulo("Cancion "+i);
         pl01.agregarCancion(cancion);
         pl02.agregarCancion(cancion);
      }
      System.out.println("Bienvenido\n");
      while(true){
         System.out.println("Seleccione una lista:");
         System.out.println("[1] "+pl01.getNombreLista()+"\n");
         System.out.println("[2] "+pl02.getNombreLista()+"\n");
         System.out.println("[0] Salir");
         int opcion = -1;
         try{
            opcion = input.nextInt();
            if(opcion < 0 || opcion > 2) {
               opcion = -1;
               throw new Exception("Opción inválida");
            }
         }catch(InputMismatchException e){
            System.out.println("Solo se permiten numeros");
         }catch(Exception e){
            System.out.println(e.getMessage());
         }
         if(opcion == 0){
            System.out.println("Hasta pronto");
            break;
         } else if (opcion == 1) {
            System.out.println(pl01.toString());
         } else {
            System.out.println(pl02.toString());
         }

      }

   }

}
