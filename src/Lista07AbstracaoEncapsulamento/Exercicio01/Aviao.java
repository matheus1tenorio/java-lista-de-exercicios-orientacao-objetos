package Lista07AbstracaoEncapsulamento.Exercicio01;

public class Aviao {
    //Atributos:
    private int altitude;
    private int velocidade;

    //Construtor:
    public Aviao(int altitude, int velocidade) {
        this.altitude = altitude;
        this.velocidade = velocidade;
    }

    //Modificadores de Acesso:
    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //Métodos da Classe:
    public void reduzirVelocidade(int reducao) {
        if (reducao <= velocidade) {
            velocidade -= reducao;
        } else {
            velocidade = 0;
        }
    }

    public void reduzirAltitude(int reducao) {
        if (reducao <= altitude) {
            altitude -= reducao;
        } else {
            altitude = 0;
        }
    }
}
