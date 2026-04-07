package Ecommerce;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE,
    CANCELADO;

    private String descricao;
    private Integer codigo;

    public static StatusPedido from(Integer value) {
        return value == null ? null : values()[value];
    }
}
