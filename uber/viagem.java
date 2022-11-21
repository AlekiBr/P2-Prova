package uber;
exceptions{ 
    public abstract class viagem extends motorista {
        private int preço;               //implementamos o abstrato na classe e usei o exceptions 
        private int distancia;
        public double valor;
    

        public int getpreço(){
        return preço;
        }
        public void setpreço( int preço ){
        this.preço = preço;
        }
        public int getdistancia(){
        return distancia;
        }
        public void setdistancia ( int distancia){
        this.distancia = distancia;
        } 
    }
}

    
    

