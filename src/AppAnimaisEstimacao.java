public class AppAnimaisEstimacao {
    public static void main (String[] args) {
        System.out.println("Cachorro");

        dadosAnimais cachorro = new dadosAnimais();

        cachorro.setNome("Shesheu");
        cachorro.setIdade(2);
        cachorro.setQtdeComida(1.5F);
        cachorro.setRespondemos("Au, Au");

        System.out.println(cachorro.getNome()  + " tem " + cachorro.getIdade() + " anos de idade" );
        System.out.println(cachorro.getNome() +" " + "come " + cachorro.getQtdeComida() + " e faz " + cachorro.getRespondemos());

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Peixe");

        dadosAnimais peixe = new dadosAnimais();

        peixe.setNome("Nemo");
        peixe.setIdade(1);
        peixe.setQtdeComida(0.140F);
        peixe.setRespondemos("Blup, blup");

        System.out.println(peixe.getNome()  + " tem " + peixe.getIdade() + " anos de idade" );
        System.out.println(peixe.getNome() +" " + "come " + peixe.getQtdeComida() + " gramas e faz " + peixe.getRespondemos());

        System.out.println("--------------------------------------------------");

        System.out.println("Gato");
        dadosAnimais gato = new dadosAnimais();
        gato.setNome("Snow");
        gato.setIdade(3);
        gato.setQtdeComida(0.500F);
        gato.setRespondemos("Miau, miau");

        System.out.println(gato.getNome() + " tem " + gato.getIdade() + " anos de idade");
        System.out.println(gato.getNome() + " come " + gato.getQtdeComida() + " gramas e faz " + gato.getRespondemos());



    }


}
