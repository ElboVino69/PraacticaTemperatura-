import java.util.Scanner;

public class temperatura {
    /* Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.*/

public static Float Datos() {
    Scanner grados_Scanner = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en grados Fahrenheit:");
    return grados_Scanner.nextFloat();
}

public static float Operacion(Float grados_Fahrenheit)  {
    return ((grados_Fahrenheit - 32) * (5 / 9));
}
public static void main(String[] args) {
    Float grados_Fahrenheit = Datos();
    Float grados_Celsius = Operacion(grados_Fahrenheit);
    System.out.print("Temperatura en grados Celsius es: "+ grados_Celsius+ "°C");
}

}
