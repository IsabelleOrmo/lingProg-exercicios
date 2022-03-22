public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Insira ");
        // Item horhor = new Item(12, "muito bom apice", -7, -86);
        Item horhor = new Item();
        horhor.setCod(69);
        horhor.setDesc("nyyyyyaaaaaa");
        horhor.setPreco(9.99f);
        horhor.setQntd(8);

        System.out.println("codigo:  " + horhor.getCod());
        System.out.println("descrição:  " + horhor.getDesc());
        System.out.println("Quantidade:  " + horhor.getQntd());
        System.out.println("Preço:  " + horhor.getPreco());
        System.out.println("Total:  " + horhor.getTotal());
    }
}
