  import java.util.Scanner;
  class tar4{
     static Scanner input= new Scanner(System.in);

     public static void tarea4() {
        int num;
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es par");
            }
            else {
                System.out.println("El número es impar \n");
            }
            System.out.println("Ingrese otro número: ");
            num = input.nextInt();
        }
    }  
  }
