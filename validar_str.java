void main() {
        String input = IO.readln("Digite uma string: ");
        if (input.isBlank()) {
            IO.println("A string é inválida. Por favor, digite uma string não vazia.");
        } else {
            IO.println(input);
        }
    }
