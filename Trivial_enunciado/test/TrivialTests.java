import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

import java.util.Random;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arrange
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    // Test Problema 1
    @Test
    public void tener_al_menos_2_jugadores(){
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Jose");

        boolean expected = game.esJugable();

        Assertions.assertEquals(expected, true);
    }

    // Test Problema 2
    @Test
    public void tener_al_menos_2_jugadores_y_maximo_6(){
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Jose");
        game.agregar("Antonio");
        game.agregar("Pedro");
        game.agregar("Pepe");
        game.agregar("Jose");

        boolean expected = game.esJugable();

        Assertions.assertEquals(expected, true);
    }

    // Test Problema 4
    @Test
    public void noGanador_y_ganador(){
        Game game = new Game();
        game.agregar("Maria");
        game.agregar("Jose");
        game.agregar("Antonio");

        boolean noGanador;

        Random rand = new Random();

        do {

            game.tirarDado(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                noGanador = game.respuestaIncorrecta();
            } else {
                noGanador = game.fueRespuestaCorrecta();
            }



        } while (!noGanador);

        Assertions.assertEquals(noGanador, true);
    }

   /* @Test
    public void mas_de_50_preguntas() {

        boolean noGanador;

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

        Assertions.assertEquals(noGanador, true);
    }*/
}