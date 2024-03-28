public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        /*
        Coloca uma breve apresentação de um sistema da empresa
         */
        System.out.println("Sistema de Controle da empresa EBAC");
        System.out.println("");
        /*
        Começar a colocar modelos e propriedades do produto
         */
        System.out.println("Modelo: "+produto.cadastrarModeloProduto());
        produto.setId(1);
        System.out.println("ID: "+ produto.getId());
        System.out.println("Dono do equipamento: "+ produto.cadastrarNome());


    }
}