import java.util.Scanner;

public class Riley {
    public static void main (String [] args){ 
        int amizade, tristeza, alg;
        int alegria = 0;5
        double a1, a2, a3, media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de novas amizades: ");
        amizade = scanner.nextInt();

        if (amizade>0){
            alegria = amizade*10;
        } else {
            tristeza = 30;
        }
        System.out.println("Informe a nota da A1: ");
        a1 = scanner.nextDouble();
        System.out.println("Informe a nota da A2: ");
        a2 = scanner.nextDouble();
        System.out.println("Informe a nota da A3: ");
        a3 = scanner.nextDouble();
        media = (a1+a2+a3)/3;
        System.out.println("A média da Riley é " + media);

        if (media>=7){
            alegria = 50;
        } else {
            tristeza = 50;
        }
        System.out.println("Informe o número de atividades realizadas: ");
        alg = scanner.nextInt();
        if (alg>0){
            alegria = alg*10;
            tristeza = (10-alg)*10;
        } else {
            tristeza = 100;
        }

        if (alegria>tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }


}
}

