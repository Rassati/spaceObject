package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Meteoro extends Asset {
    private int tamanho;
    private int poder;


    public Meteoro( int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        Random r = new Random();
        int tamanhomaximo = 8;
        this.tamanho = r.nextInt(tamanhomaximo)+1;
        this.poder = tamanho;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }


    public void tomarTiro(Tiro tiro){
    this.poder -= tiro.getPoder();

    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPoder() {
        return poder;
    }
}

