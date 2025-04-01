

public class MinhaClasse {
    // Definindo uma classe de acordo com o nome do arquivo
    // O arquivo deve conter todas as palavras capitalizadas
    
public static void main(String [] args){
        // Definido o método main como ponto de entrada do programa
        // Ele será definido quando o programa é um executável

    System.out.println("Ola, Mundo!");
        // Usando o método printIn para exibir uma mensagem na tela
        // O método printIn é um método da classe System.out
        
    String primeiroNome = "Thomas";
    String segundoNome = "Borges";
        // Definindo duas variáveis do tipo String

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // Chamando o método nomeCompleto e passando as variáveis como parâmetros

    System.out.println(nomeCompleto);
        // Usando o método printIn para exibir o nome completo na tela
}
 
public static String nomeCompleto (String primeiroNome, String segundoNome) {
        // Definindo um método que retorna o nome completo
        // O método é estático, então pode ser chamado sem instanciar a classe
    return primeiroNome.concat(" ").concat(segundoNome);
        // Ou return primeiroNome + " " + segundoNome;
        // O método concat é um método da classe String
}

}