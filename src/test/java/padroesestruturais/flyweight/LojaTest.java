package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveRetornarProdutos() {
        Loja loja = new Loja();
        loja.cadastrar("Celular", "Samsung", "Coreia do Sul");
        loja.cadastrar("Tablet", "Samsung", "Coreia do Sul");
        loja.cadastrar("Fone", "Samsung", "Coreia do Sul");
        loja.cadastrar("Notebook", "Dell", "EUA");

        List<String> saida = Arrays.asList(
                "Produto{nome='Celular', marca='Samsung', pais='Coreia do Sul'}",
                "Produto{nome='Tablet', marca='Samsung', pais='Coreia do Sul'}",
                "Produto{nome='Fone', marca='Samsung', pais='Coreia do Sul'}",
                "Produto{nome='Notebook', marca='Dell', pais='EUA'}");

        assertEquals(saida, loja.obterProdutos());
    }

    @Test
    void deveRetornarTotalMarcas() {
        Loja loja = new Loja();
        loja.cadastrar("Celular", "Samsung", "Coreia do Sul");
        loja.cadastrar("Tablet", "Samsung", "Coreia do Sul");
        loja.cadastrar("Fone", "Samsung", "Coreia do Sul");
        loja.cadastrar("Notebook", "Dell", "EUA");

        assertEquals(2, MarcaFactory.getTotalMarcas());
    }

}