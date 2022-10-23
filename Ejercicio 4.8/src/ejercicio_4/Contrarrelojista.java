package ejercicio_4;

public class Contrarrelojista extends Ciclista {
    private double velocidadMáxima;
    
    public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }
    
    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }
    
    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + velocidadMáxima);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un constrarrelojista”
    */
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
