import org.templateMethody.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEntregaExpressaTest {

    @Test
    void deveRetornarFreteExpresso() {
        PedidoEntregaExpressa pedido = new PedidoEntregaExpressa();
        assertEquals(30.0f, pedido.calcularFrete());
    }

    @Test
    void deveRetornarValorTotal() {
        PedidoEntregaExpressa pedido = new PedidoEntregaExpressa();
        pedido.setValorProdutos(100.0f);
        assertEquals(130.0f,
                pedido.getValorProdutos() + pedido.calcularFrete());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoEntregaExpressa pedido = new PedidoEntregaExpressa();
        pedido.setValorProdutos(100.0f);
        pedido.setNomeCliente("Marco");
        pedido.setCodigo(1);

        assertEquals(
                "PedidoEntregaExpressa{codigo=1, nomeCliente='Marco', valorTotal=130.0}",
                pedido.getInfo()
        );
    }
}
