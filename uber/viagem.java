package uber;

    public abstract class viagem extends motorista {
        private int preço;                                                         //implementamos o abstrato na classe 
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
        public double mostrarvalor(){
            this.preço / this.distancia;
            System.out.println("valor:"+this.valor);
        }
    }

    
    

