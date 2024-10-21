import java.util.Scanner;

public class javaFunctions {

    // VARIABLES Y CONSTANTES GLOBALES
    static final int ANYO_ACTUAL = 2024;

    // Función principal (HILO DE EJECUCIÓN PRINCIPAL)
    // MAIN RUNTIME THREAD
    public static void main(String[] args) {
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

    for (int i=0; i<20; i++){
        saludar();
    }
    }

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

    public static int calcularEdad(int anyoNacimiento){
        // int edad = ANYO_ACTUAL - anyoNacimiento;
        // return edad;
        return ANYO_ACTUAL- anyoNacimiento;
    }
}
