package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {

    public List<Asset> assets;
    public Nave nave;
    public int pontos;
    public int nivel;

    public Jogo() {
        this.assets = new ArrayList<>();
        this.nave = new Nave(280,400,10,Direcao.DIREITA);
        this.pontos = 0;
        this.nivel = 1;
    }

    public Tiro atirar(){
        var tiro = this.nave.Atirar(this.nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro(){
        int MAXIMOX = 640;
        int MINIMOY = 0;
        Random x = new Random();
        var meteoro = new Meteoro(x.nextInt(MAXIMOX), MINIMOY, 2, Direcao.BAIXO );
        assets.add(meteoro);
        return meteoro;


    }

    public void pontuar(){
        this.pontos++;
        switch (pontos){
            case 10:
                nivel = 2;
                break;
            case 20:
                nivel = 3;
                break;
            case 30:
                nivel = 4;
                break;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }
}
