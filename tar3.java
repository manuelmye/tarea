import java.util.Scanner;
import java.math.BigInteger;

class tar3{
    static Scanner input= new Scanner(System.in);
    public static void calcularMediaGeoArit() {
        int cantNumeros;
        double mediaArit=0, mediaGeo=1;
        System.out.print("Ingrese la cantidad de números para tal operación: ");
        cantNumeros=input.nextInt();
        for(int contador=1;contador<=cantNumeros;contador++){
            System.out.print("Ingrese el valor de la posicion "+contador+": ");
            double numeroLeido=input.nextDouble();
            mediaGeo *= numeroLeido;
            mediaArit += numeroLeido;
        }
            mediaGeo=Math.sqrt(mediaGeo);
            mediaArit=mediaArit/cantNumeros;
        if(mediaGeo<mediaArit) {
            System.out.println("El valor Geométrico es Menor con el valor de:"+mediaGeo+": ");
        }
        else {
            System.out.println("El valor Aritmético es Menor con el valor de:"+mediaArit+": ");
        }
    public static void main(String[] args)(
    System.out.println("El valor es:"+mediaGeo+":");
    )
    }
}