package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public abstract class Asset {
    protected int x;
    protected int y;
    protected ImageView imagem;
    protected int velocidade;
    protected Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void mover(){
        switch (direcao){
            case CIMA:
                y--;
                break;
            case BAIXO:
                y++;
                break;
            case DIREITA:
                x++;
                break;
            case ESQUERDA:
                x--;
                break;
        }
    }

    public boolean colidiuCom(Asset asset){
        return x < asset.getX() + 50 &&
                x + 50 > asset.getX() &&
                y < asset.getY() + 50 &&
                y+ 50 > asset.getY();
    }
}
