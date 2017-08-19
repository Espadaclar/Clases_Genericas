
import java.util.GregorianCalendar;

public class Metodo_Generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombres ={ "pepa", "juan", "ana"};
        Integer num[] = {45, 23, 45, 56, 678, 54, 1, -98};
        GregorianCalendar fechas[] = {new GregorianCalendar(2000, 05, 23), 
                                        new GregorianCalendar(2010, 05, 23),
            new GregorianCalendar(1800, 05, 23),new GregorianCalendar(2170, 05, 23)};
        System.out.println("\nElementos menores en los Array.");
        System.out.println(MisMatrices.getElementoMenor(nombres));
        System.out.println(MisMatrices.getElementoMenor(num));
        System.out.println(MisMatrices.getElementoMenor(fechas));
    }   
}  
// CLASE CON MT GENÉRICO, SE EJECUTA CON CUALQUIER TIPO DE DATO que implemente la interface Comparable
class MisMatrices{
    
    /**
     * ---> COMPARA LOS ELEMENTOS DE UN ARRAY LIST Y DEVUELVE EL MENOR DE ELLOS. 
     *      PARA ELLO ES NECESARIO IMPLEMENTAR LA INTERFACE 'Comparable', para utilizar el mt 'compareTo(,,,,)'
     * 
     *   LA FORMA DE IMPLEMENTAR LA INTERFACE ES; '<T extends Comparable>', (esto obliga a que el atributo implemente la interface).
     *   
     * ----- en el atributo, T[] indica que el Array puede ser de cualquier tipo, el mt funcionará igualmente.
     * ----- el simbolo dimante;   <T>  le convierte en mt genérico.
     * @param <T> genérico, puede ser de cualquier tipo.
     * @param a nombre del array.
     * @return T cualquier tipo de objeto.
     */
    public static <T extends Comparable> T getElementoMenor(T[] a){
        T menor =  a[0];  // T es una variable de tipo genérico.
        if(a == null || a.length == 0) menor = null;
        for(int i = 1; i < a.length; i ++){
            if(menor.compareTo(a[i]) > 0){
                menor =  a[i];
            }
        }
        return menor;
    }
}