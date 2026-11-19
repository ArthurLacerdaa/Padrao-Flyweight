package padroesestruturais.flyweight;

public class Produto {

    private String nome;
    private Marca marcaFabricante;

    public Produto(String nome, Marca marcaFabricante) {
        this.nome = nome;
        this.marcaFabricante = marcaFabricante;
    }

    public String obterProduto() {
        return "Produto{" +
                "nome='" + this.nome + '\'' +
                ", marca='" + marcaFabricante.getNome() + '\'' +
                ", pais='" + marcaFabricante.getPais() + '\'' +
                '}';
    }
}
