package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(String nomeProduto, String nomeMarca, String pais) {
        Marca marca = MarcaFactory.getMarca(nomeMarca, pais);
        Produto produto = new Produto(nomeProduto, marca);
        produtos.add(produto);
    }

    public List<String> obterProdutos() {
        List<String> saida = new ArrayList<String>();
        for (Produto produto : this.produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }


}
