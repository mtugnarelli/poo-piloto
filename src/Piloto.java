
class Piloto {

	/*
	 * pre : navePilotada ha despegado de la Base
	 * post: el Piloto hace avanzar navePilotada en dirección NORTE hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlNorteHastaObstaculo(Nave navePilotada) {
		
		int casillerosAvanzados = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearNorte() == Espectro.VACIO) {
			
			navePilotada.avanzarAlNorte();
			
			casillerosAvanzados = casillerosAvanzados + 1;
		}
		
		return casillerosAvanzados;
	}
}
