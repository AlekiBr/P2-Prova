package uber;

public class motorista extends passageiro {
    private String carteira;      //implementamos a segurança e a aula sobre a herança,junto com o polimorfismo
    public String disponibilidade;
    public int preço;
    
    public String getcarteira(){
        return carteira;
    }

    public void setcarteira(String carteira){
        this.carteira = carteira;
    }
    public String getdisponibilidade(){
        return disponibilidade;
    }
    public int getpreço(){
         return preço;
    }
    public void setpreço( int preço ){
            this.preço = preço;
    }
    public void setdisponibilidade( String disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    void imprimemotorista(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("disponibilidade: " +this.disponibilidade);
        System.out.println("preço: " +this.preço);
}

}