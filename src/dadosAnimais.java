public class dadosAnimais {
    //Caracteristicas, propriedades do objeto = atributos
    private String animal;
    private String nome;
    private int idade;
    private float qtdeComida;
    private String respondemos;


    //Necessário para utilizar os atributos da classe na hora de criar o objeto
    //Para colocar um valor

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQtdeComida(float qtdeComida) {
        this.qtdeComida = qtdeComida;
    }

    public void setRespondemos(String respondemos) {
        this.respondemos = respondemos;
    }
    // Necessário para pegar um valor de um atributo

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getQtdeComida() {
        return qtdeComida;
    }

    public String getRespondemos () {
        return respondemos;
    }
}


