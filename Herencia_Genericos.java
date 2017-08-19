
public class Herencia_Genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // UTILIZANO LA HERENCIA
       /* Empleado administrativo = new Empleado("Elena", 45, 1500);
        Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
        // UTILIZANO LA HERENCIA, o sea el principio de sustitución, es un, --- si un jefe es un empleado...
        //si Jefe hereda de Empleado, puedo almacenar un objeto Jefe en una variable de tipo Empleado.
        Empleado nuevoEmpleado = DirectoraComercial;*/
        
        //Al ser la cl Pareja Generica le especificamos el tipo de dato que le pasamos <Empleado>
        Pareja<Empleado> Administrativa = new Pareja<>();

        //Al ser la cl Pareja Generica le especificamos el tipo de dato que le pasamos <Jefe>
        Pareja<Jefe> DirectoraComercial = new Pareja<>();
        // UTILIZANO LA HERENCIA, o sea el principio de sustitución, es un, --- si un jefe es un empleado...
        //si Jefe hereda de Empleado, puedo almacenar un objeto Jefe en una variable de tipo Empleado.
        // ¿¿¿¿¿¿¿¿¿¿ ESTE PRINCIPIO EN LAS CLASES GENÉRICAS NO VALE
        //--------------------------------------Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
        Pareja.imprimirTrabajador(Administrativa);
        Pareja.imprimirTrabajador(DirectoraComercial);
    }

}

// SERIE DE CLASES GENERICAS----------------------------------------------------
class Pareja<T> {

    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T nuevoValor) {
        primero = nuevoValor;
    }

    public T getPrimero() {
        return primero;
    }
    
    /**
     * para que la herencia funcione con las subClases que hereda de Empleado tenmos que añadir
     *  entre los corchetes diamantes --- ? extends--- le estamos diciendo que ademas de poder recibir
     *  un parámetro de tipo Empleado, puede recibir.  ( ? cualquier subclase perteneciente a Empleado)
     * @param p 
     */
    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }
}
//------------------------------------------------------------------------------
class Empleado {

    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String dameDatos() {
        return "El empleado se llama " +nombre+ " tiene " +edad+ " años, y un salario de " +sueldo;
    }
}
//------------------------------------------------------------------------------
class Jefe extends Empleado{

    public Jefe(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
    }
      
    public double incentivo(double inc){
        return inc;
    }          
}
//----------------