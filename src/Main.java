public class Main {
    public static void main(String[] args) {
        // Aula de Orientacoes D Objetos
        // Declarar objetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definicao do formyo
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();
        // Declarar objetos
        Pessoa rainha;
        rainha = new Pessoa();
        // Defininfo froma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tummer";
        // Definição de comportamento
        System.out.println(rainha.falar("alto"));
    }
}