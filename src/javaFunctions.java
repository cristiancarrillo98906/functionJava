import java.util.Scanner;

public class javaFunctions {

    // VARIABLES Y CONSTANTES GLOBALES
    static final int ANYO_ACTUAL = 2024;

    // Función principal (HILO DE EJECUCIÓN PRINCIPAL)
    // MAIN RUNTIME THREAD
    public static void main(String[] args) {
        try{
    saludar();
    saludar();
    saludar2("Cristian");
    saludar2("paco");
    saludar2("ana");
    dameNumeroPI(); // ESto solamente imprime PI porque esta dentro de la funcion
        System.out.println(dameNumeroPI());

        System.out.println(sumamos(2, 8));
        System.out.println(sumamos(5, 9));
        System.out.println(sumamos(8, 8));
        System.out.println(sumamos(2, 2));
        System.out.println(sumamos(2, 3));
        double resultadoSuma = sumamos(2,7);
        System.out.println(resultadoSuma);

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento: ");
        int anyoNacimiento = Integer.parseInt(scn.nextLine());
        // int edad = scn.nextLine();
        System.out.printf("Tu edad es de %d años \n",calcularEdad(anyoNacimiento));

    /*for (int i=0; i<20; i++){
        saludar();
    }*/


        /* Instrucciones que se pretender ejecutar
        *  y que van a estar protegidas
        * */
        System.out.println("Introduzca un número");
        int numero = Integer.parseInt(scn.nextLine());
        if(numero<0){
            // el throw fuerza el error a que entre en el catch
            throw new Exception("El número no puede ser negativo"); // el throw lanza una exception en el caso de ocurrir un error, y lo envia al catch a que capture el error
        }
        System.out.println("Has introducido el nª : " +numero);
    } catch (Exception e){ // la 'e' es el objeto que captura el errro capturado
        System.out.println("Ha ocurrido un error!!!!");
        System.out.println(e.getMessage()); // Esto es lo más usado para saber los errores y muestra lo que contiene la excepcion sobre el error capturado
        //e.printStackTrace(); // esto muestra las lineas rojas de codigo sobre el error capturado
    } finally {
        //OPCIONAL
        //Instrucciones que se van a ejecutar si o si
        //exista o no exista error
        System.out.println("Programa Terminado! ");
    }

    } // FINAL MAIN


    /* CREAR NUESTRAS FUNCIONES
         FUERA DEL MAIN
        PERO DENTRO DE LA CLASE */

    // 1 - Funcion SIN parámetros y SIN retorno
    public static  void saludar(){
        //IMPLEMENTACION
        System.out.println("-----------");
        System.out.println("Hola");
        System.out.println("Que tal estás?");
        System.out.println("Adiós");
        System.out.println("-----------");
    }
    
    // FUNCION CON PARÁMETROS DE ENTRADA Y SIN RETORNO
    public static  void saludar2(String nombre){
        System.out.println("------------------");
        System.out.println("Hola");
        System.out.printf("Que tal estás, %s ?\n", nombre);
        System.out.println("Adiós");
        System.out.println("-----------");

    }

    // 3 - FUNCION SIN PARAMETROS Y CON RETURN
    public static double dameNumeroPI(){
        final double numPI = Math.PI;
        System.out.println(numPI);
        return numPI;
    }

    // 4 - FUNCION CON PARAMETROS Y CON RETORNO
    public static double sumamos(double a, double b){
        double resultado = a + b; // ESTO ES REDUNDANTE
        return a + b; // ESTO EQUIVALE A LA LINEA DE ARRIBA
    }

    public static int calcularEdad(int anyoNacimiento) throws Exception {
        // int edad = ANYO_ACTUAL - anyoNacimiento;
        // return edad;
        //return 2024 - anyoNacimiento;
        int edad = -1;
        try{
            if(anyoNacimiento < 0 ){
                throw new Exception("El año de nacimiento no puede ser negativo");
            }else {
                edad = ANYO_ACTUAL - anyoNacimiento;
            }
        } catch (Exception e){
            System.out.println("Error dentro de la función!!");
            System.out.println(e.getMessage());
        }finally {
            return edad;
        }
    }
}

