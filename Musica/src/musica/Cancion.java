
package musica;

/**
 *
 * @author LD
 */
public class Cancion {
    
    String titulo, artista ;
    boolean fav, descarga;
    int segundos, minutos;

    public Cancion(String titulo, String artista, boolean fav, boolean descarga, int segundos, int minutos) {
        this.titulo = titulo;
        this.artista = artista;
        this.fav = fav;
        this.descarga = descarga;
        this.segundos = segundos;
        this.minutos = minutos;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    public boolean isDescarga() {
        return descarga;
    }

    public void setDescarga(boolean descarga) {
        this.descarga = descarga;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public void adelantarCancion(int segundos){
    
    int segundosActuales = this.segundos;
    int minutosActuales = this.minutos;
    
    int segundosTotales = segundosActuales + segundos;
    int minutosTotales = (segundosTotales /60) + minutosActuales;
    
    int nuevosSegundos = segundosTotales % 60;

    this.minutos = minutosTotales;
    this.segundos = nuevosSegundos;

    }  
    
    public String mostrarDetalles(){
        String info;
        int segundos = this.segundos;
        int minutos = this.minutos;
        String duracion;
        if(minutos <= 9){
           duracion = "0"+minutos; 
        }else{
           duracion = minutos + "";
        }
        
        if(segundos <= 9){
            duracion = duracion +":"+"0"+segundos;
        }else{
            duracion = duracion +":"+segundos;
        }

        info = this.titulo+"\n";
        info= info+this.artista+"\n";        
        info= info+duracion;
        
        return info;
    }
    
    public String tipoDuracion(){
        if(this.minutos >= 5){
            return "La cancion es larga";
        }else{
            return "La cancion es corta";
        }
    }
    
    
    
    
    
}
