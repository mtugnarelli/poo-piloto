UNTreF - Algoritmos y Programación 1

# Práctica de POO - Piloto

## Ejercicio 1

### Enunciado

Implementar la clase `Piloto`

```java
class Piloto {

	/*
	 * pre : navePilotada ha despegado de la Base
	 * post: el Piloto hace avanzar navePilotada en dirección NORTE hasta encontrar  
	 *       obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlNorteHastaObstaculo(Nave navePilotada)
	
}
```

### Ejecución

```java
new BatalaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
```

### Solución

`Piloto.java` [ver][ejercicio1]

## Ejercicio 2

### Enunciado

Implementar para la clase `Piloto` el método:

```java
/*
 * pre : navePilotada ha despegado de la Base
 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
 *       que ocupa el Casillero contiguo en dirección NORTE de la misma.
 */
void destruirObstaculoAlNorte(Nave navePilotada)
```

### Ejecución

```java
new BatalaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
```
 
### Solución

Primera aproximación: `Piloto.java` [ver][ejercicio2]

Considerando que al NORTE puede existir un Agujero Negro o el límite del Tablero: `Piloto.java` [ver][ejercicio2.1]

```java
new BatalaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
```

## Ejercicio 3

### Enunciado

Implementar para la clase `Piloto` los métodos:  `avanzarAlSurHastaObstaculo`, `avanzarAlEsteHastaObstaculo` y 
`avanzarAlOesteHastaObstaculo`, equivalentes a `avanzarAlNorteHastaObstaculo` pero en las otras tres direcciones:
SUR, ESTE y OESTE respectivamente. 

### Ejecución

```java
new BatalaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.avanzarAlEsteHastaObstaculo(nave)
pilotoNovato.avanzarAlOesteHastaObstaculo(nave)
pilotoNovato.avanzarAlSurHastaObstaculo(nave)
```

### Solución

`Piloto.java` [ver][ejercicio3]


[ejercicio1]:../ejercicio1/src/Piloto.java
[ejercicio2]:../ejercicio2/src/Piloto.java
[ejercicio2.1]:../ejercicio2.1/src/Piloto.java
[ejercicio3]:../ejercicio3/src/Piloto.java
