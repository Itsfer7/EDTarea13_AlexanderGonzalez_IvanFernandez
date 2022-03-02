# EDTarea13_AlexanderBlazquez_IvanFernandez

# Version 1.0
# Sin cambios

# Version 1.1
# Eliminamos código repetido de posición de jugador

# Version 1.2
# Añadimos un "if" para que compruebe que siempre hay, como mínimo, 2 jugadores para comenzar la partida. Si esto no se cumple se mostrará un mensaje diciendo que no hay jugadores suficientes.

# Version 1.3
# En el método "agregar" hacemos un cambio en "posiciones", "monederos" y "enCasillaCastigo" para obtener el número correcto. En vez de escribir "posiciones[cuantosJugadores()] = 0" pondremos "posiciones[cuantosJugadores() - 1] = 0;" (y así con los tres casos). Esto permitirá empezar desde la posición 0 del array y añadir jugadores e ir aumentando el número del array de forma correcta.

# Version 1.4
# En el método "tirarDado" se utiliza una variable (estaSaliendoDeLaCarcel) que se actualiza pero no se guarda en ningun sitio. Si en vez de esta variable utilizamos "enCasillaCastigo", podemos ir guardandola en el array de boolean y así comprobar en cada caso si el jugador sigue en la carcel.

# Version 1.5
# Extraemos el código de los métodos "returnGanador" y "respuestaIncorrecta" y creamos el método "siguienteJugador". De esta forma todo estará más ordenado y será más sencillo de leer. 

# Version 1.6
# En el método "fueRespuestaCorrecta" no son necesarios los "ifs" ya que en los dos casos, ya sea TRUE o FALSE, siempre devolverá lo mismo.

# Version 1.7
# Cambiaremos el bucle for y pondremos un máximo de, por ejemplo, 1000 preguntas de cada tipo (previamente siendo 50). No podemos poner un bucle infinito ya que no será capaz de imprimir cada caso sin quedarse sin memoria antes. Con 1000 casos debería valer ya que la probabilidad de llegar a la pregunta 1000 (de cualquiera de las 4 categorías) antes de que un jugador llegue a las 6 monedas es ínfima.