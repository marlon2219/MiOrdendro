
package dominio;

public class Orden {
    private final int idOrden;
    Computadora computadoras [];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static int maxComputadoras = 5;
    

    public Orden() {
        contadorComputadoras = 0;
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
       
    }
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < maxComputadoras){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("no se pueden agregar mas computadoras, has" + "llegado al limite de" +maxComputadoras +"computadoras por orden");
        }
    }
    public void mostrarOrden(){
        System.out.println("ID. Orden" + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
    
    
}
