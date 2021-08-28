package SobreEscribir;

public class Persona extends Animal {
    
    @Override //Sobre escribiendo el metodo comer
    public void comer(){
        System.out.println("Estoy comiendo con cubiertos");
    }
    
}
