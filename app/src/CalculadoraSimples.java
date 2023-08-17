import java.util.Scanner;

public class CalculadoraSimples {
    public static int somaNumeros(int numero1, int numero2){
        return numero1 + numero2;
    }
    public static int subNumeros(int numero1, int numero2){
        return numero1 - numero2;
    }
    public static int multiNumeros(int numero1, int numero2){
        return numero1 * numero2;
    }
    public static float diviNumero(int numero1, int numero2){
        return (float) numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        int op;

        do {
            System.out.println("Escolha uma opção: \n 1. Adição \n 2. Subtração \n 3. Multiplicação \n 4. Divisão\n 0. Sair \n");
            op = sc.nextInt();
            switch (op){
                case 1:
                    int resultadoSoma = somaNumeros(numero1, numero2);
                    System.out.println("A soma é: " + resultadoSoma);
                    break;
                case 2:
                    int resultadoSub = subNumeros(numero1, numero2);
                    System.out.println("A subtração é: " + resultadoSub);
                    break;
                case 3:
                    int resultadoMulti = multiNumeros(numero1, numero2);
                    System.out.println("A multiplicação é: " + resultadoMulti);
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("Não é possível dividir por 0.");
                    } else {
                        float resultadoDivisao = diviNumero(numero1, numero2);
                        System.out.println("A divisão é: " + resultadoDivisao);
                    }
                    break;
            }
        }while(op != 0);
    }
}
