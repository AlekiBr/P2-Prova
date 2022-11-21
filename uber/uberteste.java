package uber;


public class uberteste {
    public static void main (String args[]){
        passageiro ps = new passageiro();
        ps.nome = "Jurema almeida";
        ps.idade = 30;
        ps.localizaçao = 45;

        motorista mt = new motorista();
        mt.disponibilidade = "SIM";
        mt.idade = 43;
        mt.nome = "Fabio do Honda Civic";
        mt.preço = 5;

        viagem.vj = new viagem(); 
        vj.preço = 5;
        vj.distancia =45; 


    ps.imprimeAtributos();
    mt.imprimemotorista();


}

}
