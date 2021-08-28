package SobreEscribir;

public class Gato extends Animal{
    
    @Override  //Sobre escribiendo el metodo comer
    public void comer(){
        System.out.println("Estoy comiento con mi platito en el suelo");
    }
    
}
