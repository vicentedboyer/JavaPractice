public class Vehiculo{
        private String tipo;
        private int velocidadMaxima;
        private boolean rapido;

        public void setRapido(boolean rapido){
                this.rapido = rapido;
        }
        public boolean isRapido(){
                return this.rapido;
        }
        public void setVelocidadMaxima(int velocidadMaxima){
                this.velocidadMaxima = velocidadMaxima;
        }

        public int getVelocidadMaxima(){
                return this.velocidadMaxima;
        }

        public void setTipo(String tipo){
                this.tipo = tipo;
        }

        public String getTipo() {
                return this.tipo;
        }
}
