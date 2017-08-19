public class Metodo_Generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombres ={ "pepa", "juan", "ana"};
        Integer num[] = {45, 23, 45, 56, 678, 54};
        System.out.println(MisMatrices.getElementos(nombres));
        System.out.println(MisMatrices.getElementos(num));
    }   
}  
// CLASE CON MT GENÉRICO, SE EJECUTA CON CUALQUIER TIPO DE DATO
class MisMatrices{
    
    /**
     * ----- en el atributo, T[] indica que el Array puede ser de cualquier tipo, el mt funcionará igualmente.
     * ----- el simbolo dimante;   <T>  le convierte en mt genérico.
     * @param <T> genérico, puede ser de cualquier tipo.
     * @param a nombre del array.
     * @return la longitud de un array.
     */
    public static <T> String getElementos(T[] a){
        return " la cadena tiene " +a.length+ " elementos";
    }
}