package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	int minIndex = 0; int maxIndex = 0;
			List<Cidade> cidades = new ArrayList<>(){
				{
					add(new Cidade("Londres", -2, 33));
					add(new Cidade("Madrid",-3, 32));
					add(new Cidade("Nueva York",-8, 27));
					add(new Cidade("Buenos Aires",4, 27));
					add(new Cidade("Asuncion", 6, 42));
					add(new Cidade("São Paulo",5, 43));
					add(new Cidade("Lima",0, 39));
					add(new Cidade("Santiago de Chile",-7, 26));
					add(new Cidade("Lisboa",-1, 31));
					add(new Cidade("Tokio",-10, 35));
				}
			};

			for (int i=0; i<cidades.size(); i += 1) {
				if (cidades.get(i).getTempMin() < cidades.get(minIndex).getTempMin()) {
					minIndex = i;
				}
				if (cidades.get(i).getTempMax() > cidades.get(maxIndex).getTempMax()) {
					maxIndex = i;
				}
			}
			System.out.println( "Cidade mais quente: " + cidades.get(maxIndex).getNome() + " com " + cidades.get(maxIndex).getTempMax() + " graus");
			System.out.println( "Cidade mais fria: " + cidades.get(minIndex).getNome() + " com " + cidades.get(minIndex).getTempMin() + " graus");
		}
}
