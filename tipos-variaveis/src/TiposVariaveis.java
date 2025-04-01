public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos de variáveis em Java
        // Tipos primitivos: byte, short, int, long, float, double, char, boolean
        // Tipos não primitivos: String, Arrays, Classes, Interfaces

        // Tipos primitivos
        byte idade = 20; // 8 bits
        short ano = 2023; // 16 bits
        int cep = 12345678; // 32 bits | Mais usado
        long cpf = 12345678901L; // 64 bits | Usado para números grandes
        float pi = 3.14f; // 32 bits | Usado para números decimais
        double salario = 2500.00; // 64 bits | Mais usado para números decimais
        char letra = 'A'; // 16 bits
        boolean verdadeiro = true; // 1 bit

        // Tipos não primitivos
        String nome = "Thomas Borges"; // Classe String

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Pi: " + pi);
        System.out.println("Salario: " + salario);
        System.out.println("Letra: " + letra);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Nome: " + nome);

    }
}
