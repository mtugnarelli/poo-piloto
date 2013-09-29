
class Piloto {

	/*
	 * pre : navePilotada ha despegado de la Base
	 * post: el Piloto hace avanzar navePilotada en dirección NORTE hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlNorteHastaObstaculo(Nave navePilotada) {
		
		int casilleros = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearNorte() == Espectro.VACIO) {
			
			navePilotada.avanzarAlNorte();
			
			casilleros++;
		}
		
		return casilleros;
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección NORTE de la misma.
	 */
	void destruirObstaculoAlNorte(Nave navePilotada) {
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearNorte() != Espectro.VACIO) {
			
			navePilotada.atacarAlNorte();
		}
	}
}
