void main() {

        int input;

        try {

            input = Integer.parseInt(IO.readln("Digite um número inteiro: "));

            if (input == 0) {
                IO.println("O número é zero.");
            } else {
                IO.println("O número digitado é: " + input);
            }

        } catch (NumberFormatException e) {

            IO.println("Entrada inválida. Por favor, digite um número inteiro válido.");
        }
}
