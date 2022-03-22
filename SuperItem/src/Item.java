public class Item {
    private int cod;
    private String desc;
    private int qntd;
    private float preco;


    public Item(int cod, String desc, int qntd, float preco) {
        this.cod = cod;
        this.desc = desc;
        this.qntd = verifyQtnd(qntd);
        this.preco = verifyPreco(preco);

    }

    public Item() {
        this.qntd = 0;
        this.preco = 0;
        this.desc = null;
    }

    private float verifyPreco(float preco) {
        if (preco < 0) {
            return 0;
        } else {
            return preco;
        }
    }

    private int verifyQtnd(int qntd) {
        if (qntd < 0) {
            return 0;
        } else {
            return qntd;
        }
    }

    public float getTotal() {
        return qntd*preco;
    } 

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQntd() {
        return this.qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = verifyQtnd(qntd);
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = verifyPreco(preco);
    }
}


