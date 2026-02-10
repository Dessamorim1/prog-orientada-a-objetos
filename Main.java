import java.util.Scanner;

public class Main{

    // Sobrecarga em POO (Java) é quando uma mesma classe tem métodos 
    // com o mesmo nome, mas com parâmetros diferentes, 
    // permitindo comportamentos variados.   

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int lado = s.nextInt();

        circulo c = new circulo(2);
        circulo c2 = new circulo(5);

        retangulo r1 = new retangulo(2,5);
        retangulo r2 = new retangulo(10,5);
        retangulo r3 = new retangulo();

        quadrado q1 = new quadrado(5);
        quadrado q2 = new quadrado(lado);

        System.out.println(c.area());
        System.out.println(c2.area());

        System.out.println(c2.comprimento(5));

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

        System.out.println(q1.area());
        System.out.println(q1.comprimento());
        System.out.println(q2.area());
        System.out.println(q2.comprimento());
        q1.desenha();
        q2.desenha();
     
    }
}