package br.com.joaocarloslima;


import javafx.scene.image.ImageView;

public class Nave extends Asset {


    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro Atirar(int poder){
        final int VELOCIDADETIRO = 10;
        return new Tiro(getX(), getY() , VELOCIDADETIRO , Direcao.CIMA , poder);
    }

    @Override
    public void mover() {
        super.mover();

        if (getX() < 0){
            setX(0);
        }
        if (getX() > 640 - 50){
            setX(640-50);
        }


    }
}
