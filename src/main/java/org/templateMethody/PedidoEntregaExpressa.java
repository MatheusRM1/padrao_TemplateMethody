package org.templateMethody;

public class PedidoEntregaExpressa extends Pedido {

    public float calcularFrete() {
        return 30.0f;
    }

    @Override
    public String getTipo() {
        return "PedidoEntregaExpressa";
    }
}
