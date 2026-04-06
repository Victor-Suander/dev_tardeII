void main() {
        IO.println("Números de 1 a 100:");

        int input;

        boolean validInput = false;

        while (!validInput) {
            try {
                input = Integer.parseInt(IO.readln("Digite um número inteiro: "));


                if (input == 0) {
                    IO.println("O número é zero.");
                } else if (input >= 1 && input <= 100) {
                    IO.println("O número digitado é: " + input);
                } else {
                    IO.println("O número digitado está fora do intervalo de 1 a 100.");
                }
                validInput = true;


            } catch (NumberFormatException e) {


                IO.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            }
        }
}