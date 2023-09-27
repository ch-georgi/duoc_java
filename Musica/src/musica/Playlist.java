
package musica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombreLista;
    private List<Cancion> canciones;

    public Playlist() {
        this.canciones = new ArrayList<>();
    }

    public Playlist(String nombreLista) {
        this.canciones = new ArrayList<>();
        this.nombreLista = nombreLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void agregarCancion(Cancion cancion){
        this.canciones.add(cancion);
    }

    public void removerCancion(int indice){
        if(!this.canciones.isEmpty() &&
                this.canciones.size() > indice &&
                indice >= 0){
            System.out.print("Se ha eliminado la cancion " +
                    this.canciones.get(indice));
            this.canciones.remove(indice);
        } else if(this.canciones.isEmpty()){
            System.out.println("La playlist esta vacia");
        } else {
            System.out.println("Indice no valido");
        }
    }

    public void removerCancion(String nombreCancion){
        String busqueda = nombreCancion.toLowerCase();
        for(Cancion cancion : this.canciones){
            if(cancion.getTitulo().toLowerCase().equals(busqueda)){
                System.out.print("Se ha eliminado la cancion " +
                        cancion.getTitulo());
                this.canciones.remove(cancion);
            }
        }
    }

    @Override
    public String toString(){
        String listaCanciones = this.nombreLista + ":\n";
        int nroCancion = 1;
        for(Cancion cancion : this.canciones){
            listaCanciones += nroCancion +
                    ".- " + cancion.getTitulo()+"\n";
            nroCancion++;
        }
        return listaCanciones;
    }

}
