public class Produto {
    private int id;

    private String nome;

    private String modelo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String  cadastrarModeloProduto(){
        return "Samsung Book X30";
    }

    public String cadastrarNome(){
        return "Notebook do Colaborador José Magno";
    }



}
