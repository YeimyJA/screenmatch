package com.yeimy.screenmatch.main;

import java.util.Scanner;

public class Main {
    private Scanner keyboard = new Scanner(System.in);
    public void showMenu(){
        System.out.println("Ingrese el nombre de la serie que desea buscar");
        var nameSerie = keyboard.nextLine();
    }
}
