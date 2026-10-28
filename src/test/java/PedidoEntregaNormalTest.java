import org.templateMethody.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEntregaNormalTest {

    @Test
    void deveRetornarFreteNormal() {
        PedidoEntregaNormal pedido = new PedidoEntregaNormal();
        assertEquals(15.0f, pedido.calcularFrete());
    }

    @Test
    void deveRetornarValorTotal() {
        PedidoEntregaNormal pedido = new PedidoEntregaNormal();
        pedido.setValorProdutos(100.0f);
        assertEquals(115.0f,
                pedido.getValorProdutos() + pedido.calcularFrete());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoEntregaNormal pedido = new PedidoEntregaNormal();
        pedido.setValorProdutos(100.0f);
        pedido.setNomeCliente("Marcelo");
        pedido.setCodigo(2);

        assertEquals(
                "Pedido{codigo=2, nomeCliente='Marcelo', valorTotal=115.0}",
                pedido.getInfo()
        );
    }
}
