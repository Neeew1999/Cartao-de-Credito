// Source code is decompiled from a .class file using FernFlower decompiler.
public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Cliente var1 = new Cliente("Agostinho");
      CartaoCredito var2 = new CartaoCredito("5896-4231-7031-0023", var1);
      var1.setCartao(var2);
      System.out.println("Cliente: " + var1.getNome());
      System.out.println("Cartão: " + var1.getCartao().getNumero());
      System.out.println("Dono do Cartão: " + var2.getCliente().getNome());
   }
}
