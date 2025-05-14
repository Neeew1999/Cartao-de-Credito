public class CartaoCredito {
    private String numero;
    private Cliente cliente;

    public CartaoCredito(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
}