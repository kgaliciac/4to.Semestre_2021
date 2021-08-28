package SobreCarga;

public class Atleta {
    //Atributos
    String nombre;
    String deporte;
    String pais;

    //Constructor
    public Atleta(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public Atleta(String pais) {
        this.pais = pais;
    }

    
    //Metodos iguales pero diferenciandolos ya que uno no tiene parametros y el otro manda a llamar uno (id)
    public void Atleta(){
        System.out.println("Mi nombre es " + nombre + " soy " + deporte + " en los Juegos Olimpicos");
    }
    
    public void Atleta(String pais){
        System.out.println("Pais: " + this.pais);
    }
    
}
