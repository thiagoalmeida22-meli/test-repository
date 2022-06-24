package com.company;

public class Cidade {

    final private String nome;
    final private int tempMin;
    final private int tempMax;

    public Cidade(String nome, int tempMin, int tempMax){
        this.nome = nome;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public String getNome() {
        return nome;
    }

    public int getTempMin() {
        return tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }
}
