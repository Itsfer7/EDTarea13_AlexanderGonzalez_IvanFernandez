package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean noGanador;

    public static void main(String[] args) {
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Antonio");
        juego.agregar("Pedro");
        juego.agregar("Pepe");
        juego.agregar("Jose");

        if (juego.esJugable()) {
            Random rand = new Random();

            do {

                juego.tirarDado(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    noGanador = juego.respuestaIncorrecta();
                } else {
                    noGanador = juego.fueRespuestaCorrecta();
                }



            } while (true);
        } else if (juego.cuantosJugadores() < 2) {
            System.out.println("Se han detectado muy pocos jugadores. La partida se ha cancelado.");
        } else if (juego.cuantosJugadores() > 6) {
            System.out.println("Se han detectado demasiados jugadores. La partida se ha cancelado.");
        }
    }
}
