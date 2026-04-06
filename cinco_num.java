public class cinco_num {
    int num1, num2, num3, num4, num5;
    boolean entradaValida = false;
    void main() {
        while (!entradaValida) {
            try{

                num1 = Integer.parseInt(IO.readln("Digite o 1° número: "));
                num2 = Integer.parseInt(IO.readln("Digite o 2° número: "));
                num3 = Integer.parseInt(IO.readln("Digite o 3° número: "));
                num4 = Integer.parseInt(IO.readln("Digite o 4° número: "));
                num5 = Integer.parseInt(IO.readln("Digite o 5° número: "));
                entradaValida = true;

                IO.println("Os números digitados foram: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
            } catch (NumberFormatException e) {
                IO.println("Erro!  Digite um número inteiro válido.");
            }
        }
    }}