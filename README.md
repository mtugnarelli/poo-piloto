UNTreF - Algoritmos y Programación 1

# Práctica de POO - Piloto

## Índice

* [Ejercicio 1](#ejercicio-1)
* [Ejercicio 2](#ejercicio-2)
* [Ejercicio 3](#ejercicio-3)
* [Ejercicio 4](#ejercicio-4)
* [Ejercicio 5](#ejercicio-5)
* [Ejercicio 6](#ejercicio-6)
* [Ejercicio 7](#ejercicio-7)
* [Ejercicio 8](#ejercicio-8)
* Solución Final: `Piloto.java` [ver](../src/Piloto.java)


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
new BatallaEspacial()
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
new BatallaEspacial()
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
new BatallaEspacial()
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
new BatallaEspacial()
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

## Ejercicio 4

### Enunciado 

Implementar para la clase `Piloto` los métodos:  `destruirObstaculoAlSur`, `destruirObstaculoAlEste` y 
`destruirObstaculoAlOeste`, equivalentes a `destruirObstaculoAlNorte` pero en las otras tres direcciones:
SUR, ESTE y OESTE respectivamente. 

### Ejecución

```java
new BatallaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
pilotoNovato.avanzarAlEsteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlEste(nave)
pilotoNovato.avanzarAlOesteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlOeste(nave)
pilotoNovato.avanzarAlSurHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlSur(nave)
```
### Solución

`Piloto.java` [ver][ejercicio4]

## Ejercicio 5

### Enunciado

Contabilizar la cantidad total de casilleros que un `Piloto` hizo avanzar una Nave en dirección NORTE.

### Ejecución

`pilotoNovato` pilota `nave` en dirección NORTE 3 veces, por lo que el atributo 
`casillerosAvanzadosAlNorte` tiene como valor la suma de los casilleros avanzados en las 3 oportunidades.

```java
new BatallaEspacial()
Nave nave = new Nave()
nave.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.destruirObstaculoAlNorte(nave)
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.casillerosAvanzadosAlNorte
pilotoNovato.destruirObstaculoAlNorte(nave)
pilotoNovato.avanzarAlNorteHastaObstaculo(nave)
pilotoNovato.casillerosAvanzadosAlNorte
```

`pilotoNovato` pilota `naveAlfa` en dirección NORTE 1 vez y `naveBeta` 2 veces, por lo que el 
atributo `casillerosAvanzadosAlNorte` tiene como valor la suma de los casilleros avanzados con ambas Naves. 

```java
new BatallaEspacial()
Nave naveAlfa = new Nave()
naveAlfa.despegar()
Piloto pilotoNovato = new Piloto()
pilotoNovato.avanzarAlNorteHastaObstaculo(naveAlfa)
pilotoNovato.casillerosAvanzadosAlNorte
Nave naveBeta = new Nave()
naveBeta.despegar()
pilotoNovato.avanzarAlNorteHastaObstaculo(naveBeta)
pilotoNovato.destruirObstaculoAlNorte(naveBeta)
pilotoNovato.avanzarAlNorteHastaObstaculo(naveBeta)
pilotoNovato.casillerosAvanzadosAlNorte
```

### Solución

`Piloto.java`: [ver][ejercicio5]

## Ejercicio 6

### Enunciado

Contabilizar la cantidad total de casilleros que un `Piloto` hizo avanzar una Nave en cada una de las direcciones
faltantes: SUR, ESTE, OESTE.

### Solución

`Piloto.java`: [ver][ejercicio6]

## Ejercicio 7

### Enunciado

Contabilizar la cantidad total de obstáculos destruidos por un `Piloto` en cualquier dirección.

### Ejecución

```java
new BatallaEspacial()
Nave naveAlfa = new Nave()
naveAlfa.despegar()
Piloto pilotoAtacante = new Piloto()
pilotoAtacante.avanzarAlNorteHastaObstaculo(naveAlfa)
pilotoAtacante.destruirObstaculoAlNorte(naveAlfa)
pilotoAtacante.avanzarAlOesteHastaObstaculo(naveAlfa)
pilotoAtacante.destruirObstaculoAlOeste(naveAlfa)
pilotoAtacante.obstaculosDestruidos
```

### Solución

Primer aproximación: `Piloto.java` [ver][ejercicio7]

Segunda aproximación, considerando que no siempre que se invoca alguno de los métodos de `destruirObtaculoAlXXX`
se destruye un obstáculo: `Piloto.java` [ver][ejercicio7.1]

```java
new BatallaEspacial()
Nave naveAlfa = new Nave()
naveAlfa.despegar()
Piloto pilotoAtacante = new Piloto()
pilotoAtacante.avanzarAlNorteHastaObstaculo(naveAlfa)
pilotoAtacante.destruirObstaculoAlNorte(naveAlfa)
pilotoAtacante.destruirObstaculoAlNorte(naveAlfa)
pilotoAtacante.destruirObstaculoAlSur(naveAlfa)
pilotoAtacante.obstaculosDestruidos
```

**Refinamiento final**; reemplazando `while` por `do while` para no evaluar dos veces consecutivas la existencia de
`Espectro.VACIO`: `Piloto.java` [ver][ejercicio7.2]

## Ejercicio 8

### Enunciado

Cambiar la clase `Piloto` para que en lugar de tener una Nave como parámetro de todos los métodos, `navePilotada`
sea un atributo.

### Ejecución

```java
new BatallaEspacial()
Nave naveAlfa = new Nave()
naveAlfa.despegar()
Piloto piloto = new Piloto()
piloto.navePilotada = naveAlfa
piloto.avanzarAlNorteHastaObstaculo()
piloto.avanzarAlEsteHastaObstaculo()
piloto.destruirObstaculoAlEste()

Nave naveBeta = new Nave()
naveBeta.despegar()
piloto.navePilotada = naveBeta
piloto.avanzarAlSurHastaObstaculo()
```

### Solución

`Piloto.java`: [ver][ejercicio8]


[ejercicio1]:../ejercicio1/src/Piloto.java
[ejercicio2]:../ejercicio2/src/Piloto.java
[ejercicio2.1]:../ejercicio2.1/src/Piloto.java
[ejercicio3]:../ejercicio3/src/Piloto.java
[ejercicio4]:../ejercicio4/src/Piloto.java
[ejercicio5]:../ejercicio5/src/Piloto.java
[ejercicio6]:../ejercicio6/src/Piloto.java
[ejercicio7]:../ejercicio7/src/Piloto.java
[ejercicio7.1]:../ejercicio7.1/src/Piloto.java
[ejercicio7.2]:../ejercicio7.2/src/Piloto.java
[ejercicio8]:../ejercicio8/src/Piloto.java
