public class Cliente {
    private String nome;
    private CartaoCredito cartao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public String getNome() {
        return nome;
    }
}