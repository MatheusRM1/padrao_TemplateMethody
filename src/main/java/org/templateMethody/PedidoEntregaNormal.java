package org.templateMethody;

public class PedidoEntregaNormal extends Pedido {

    public float calcularFrete() {
        return 15.0f;
    }

    @Override
    public String getTipo() {
        return "PedidoEntregaNormal";
    }

}
