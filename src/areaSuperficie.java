import java.util.Scanner;

public class areaSuperficie {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double base, altura, areaSuperficie;

        System.out.println("Informe o Valor da Base");
        base = input.nextDouble();
        System.out.println("Informe o Valor da Altura");
        altura = input.nextDouble();
        areaSuperficie = base * altura;

        System.out.println("Area de Superficie de Base = " + base);
        System.out.println("e Altura " + altura);
        System.out.println("é = " + areaSuperficie);

    }


}
