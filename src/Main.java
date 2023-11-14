// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dr = (int) ((Math.random() * 31)+1); // Número aleatorio de 1 a 100.
        int mr = (int) ((Math.random() * 12)+1);
        int d; // Día
        int m; // mes
        int aciertodia=0;
        int aciertomes=0;
        int i; // Contador para bucle for.

        System.out.println("El juego consiste en adivinar una fecha de cumpleaños.");

        System.out.print("Tienes 5 intentos. Pon un día del mes: ");
        d = sc.nextInt();
        System.out.println("Pon un mes del año: ");
        m = sc.nextInt();
        for (i=0; i<=4; i++) {

            // Primero se evalúa si se ha acertado.

            if (dr == d) {
                System.out.println("¡Has acertado el día!");
                aciertodia++; }
            if (mr == m) {
                System.out.println("¡Has acertado el mes!");
                aciertomes++;
            }
            if (aciertodia==1 && aciertomes==1){
                System.out.println("Has ganado el juego!");
            }
            // Luego da la partida por perdida si ya has gastado 5 intentos.

            else if (i == 4) {
                System.out.println("Lo siento: ¡has perdido!. La fecha era: " + dr +"/"+ mr);
                break; }

            // Si no es ninguno de los casos anteriores, comparamos números.

                else if (dr > d)
                    System.out.println("El DÍA es MAYOR que " + d);
                else if (mr > m)
                    System.out.println("El MES es MAYOR que " + m);
                else if (dr < d)
                    System.out.println("El DÍA es MENOR que " + d);
                else if (mr < m)
                    System.out.println("El MES es MENOR que " + m);

            // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.


            if (i <=1) {
                System.out.print("Otro intento: ");
                System.out.print("Escribe otro día: ");
                d = sc.nextInt();
                System.out.println("Escribe otro mes: ");
                m = sc.nextInt();
            }
            else if (i ==2) {
                int x = (int) (dr);
                System.out.println("Una pista, el día es: " + x);
                System.out.print("Inténtalo de nuevo: ");
                System.out.print("Escribe otro día: ");
                d = sc.nextInt();
                System.out.println("Escribe otro mes: ");
                m = sc.nextInt(); }
            else if (i >= 3) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                System.out.print("Escribe otro día: ");
                d = sc.nextInt();
                System.out.println("Escribe otro mes: ");
                m = sc.nextInt(); }
            if ((mr==3 && dr>=21) || (mr==4 && dr<=19)){
                System.out.println("El signo es Aries.");
            }else if ((mr==4 && dr>=20) || (mr==5 && dr<=20)){
                System.out.println("El signo es Tauro.");}
            else if ((mr==5 && dr>=21) || (mr==6 && dr<=20)){
                    System.out.println("El signo es Geminis.");}
            else if ((mr==6 && dr>=21) || (mr==7 && dr<=22)){
                System.out.println("El signo es Cancer.");}
            else if ((mr==7 && dr>=23) || (mr==8 && dr<=22)){
                    System.out.println("El signo es Leo.");}
            else if ((mr==8 && dr>=23) || (mr==9 && dr<=22)){
                System.out.println("El signo es Virgo.");}
            else if ((mr==9 && dr>=23) || (mr==10 && dr<=22)){
                System.out.println("El signo es Libra.");}
            else if ((mr==10 && dr>=23) || (mr==11 && dr<=21)){
                System.out.println("El signo es Escorpio.");}
            else if ((mr==11 && dr>=22) || (mr==12 && dr<=21)){
                System.out.println("El signo es Sagitario.");}
            else if ((mr==12 && dr>=22) || (mr==1 && dr<=19)){
                System.out.println("El signo es Capricornio.");}
            else if ((mr==1 && dr>=20) || (mr==02 && dr<=18)){
                System.out.println("El signo es Escorpio.");}
            else if ((mr==2 && dr>=19) || (mr==3 && dr<=20)){
                System.out.println("El signo es Escorpio.");}
        }
    }
}