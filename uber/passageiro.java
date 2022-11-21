package uber;

public class passageiro {
    public String nome;
    public int idade;
    public  int localizaçao;

 
        public String getnome() {          //implementamos a aula sobre encapsulamento, junto com a segurança;
         return nome;

        }   
        public void setnome(String nome){
            this.nome = nome;

        }
        public int getidade() {
            return idade;

        }
        public void setidade( int idade){
        this.idade = idade;

        }
        public int getlocalizaçao(){
        return localizaçao;

        }
        public void setlocalizaçao( int localizaçao){
        this.localizaçao = localizaçao;
        }
        void imprimeAtributos(){
            System.out.println("Nome: "+this.nome);
            System.out.println("Idade: "+this.idade);
            System.out.println("localização em KM: " +this.localizaçao);
            
        }
}