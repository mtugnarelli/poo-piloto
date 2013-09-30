
class Piloto {
	
	Nave navePilotada;
	
	int casillerosAvanzadosAlNorte = 0;

	int casillerosAvanzadosAlSur = 0;
	
	int casillerosAvanzadosAlEste = 0;
	
	int casillerosAvanzadosAlOeste = 0;

	int obstaculosDestruidos;
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto hace avanzar navePilotada en dirección NORTE hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlNorteHastaObstaculo() {
		
		int casillerosAvanzados = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearNorte() == Espectro.VACIO) {
			
			navePilotada.avanzarAlNorte();
			
			casillerosAvanzados = casillerosAvanzados + 1;
		}

		/* sumariza los casilleros avanzados en esta ejecución */
		casillerosAvanzadosAlNorte = casillerosAvanzadosAlNorte + casillerosAvanzados;
		
		return casillerosAvanzados;
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto hace avanzar navePilotada en dirección SUR hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlSurHastaObstaculo() {
		
		int casillerosAvanzados = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearSur() == Espectro.VACIO) {
			
			navePilotada.avanzarAlSur();
			
			casillerosAvanzados = casillerosAvanzados + 1;
		}
		
		/* sumariza los casilleros avanzados en esta ejecución */
		casillerosAvanzadosAlSur = casillerosAvanzadosAlSur + casillerosAvanzados;

		return casillerosAvanzados;
	}

	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto hace avanzar navePilotada en dirección ESTE hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlEsteHastaObstaculo() {
		
		int casillerosAvanzados = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearEste() == Espectro.VACIO) {
			
			navePilotada.avanzarAlEste();
			
			casillerosAvanzados = casillerosAvanzados + 1;
		}
		
		/* sumariza los casilleros avanzados en esta ejecución */
		casillerosAvanzadosAlEste = casillerosAvanzadosAlEste + casillerosAvanzados;

		return casillerosAvanzados;
	}

	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto hace avanzar navePilotada en dirección OESTE hasta encontrar 
	 *       un obstáculo.
	 *       Devuelve la cantidad de casilleros que pudo avanzar.
	 */
	int avanzarAlOesteHastaObstaculo() {
		
		int casillerosAvanzados = 0;
		
		Radar radar = navePilotada.getRadar();
		
		while (radar.escanearOeste() == Espectro.VACIO) {
			
			navePilotada.avanzarAlOeste();
			
			casillerosAvanzados = casillerosAvanzados + 1;
		}
		
		/* sumariza los casilleros avanzados en esta ejecución */
		casillerosAvanzadosAlOeste = casillerosAvanzadosAlOeste + casillerosAvanzados;

		return casillerosAvanzados;
	}	
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección NORTE de la misma.
	 */
	void destruirObstaculoAlNorte() {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al NORTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearNorte() != Espectro.DESCONOCIDO) && (radar.escanearNorte() != Espectro.VACIO)) {
			
			do {
				
				navePilotada.atacarAlNorte();
				
			} while (radar.escanearNorte() != Espectro.VACIO);

			obstaculosDestruidos = obstaculosDestruidos + 1;
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección SUR de la misma.
	 */
	void destruirObstaculoAlSur() {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al SUR es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearSur() != Espectro.DESCONOCIDO) && (radar.escanearSur() != Espectro.VACIO)) {
			
			do {
				
				navePilotada.atacarAlSur();
				
			} while (radar.escanearSur() != Espectro.VACIO);
			
			obstaculosDestruidos = obstaculosDestruidos + 1; 
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección ESTE de la misma.
	 */
	void destruirObstaculoAlEste() {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al ESTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearEste() != Espectro.DESCONOCIDO) && (radar.escanearEste() != Espectro.VACIO)) {
		
			do {

				navePilotada.atacarAlEste();
				
			} while (radar.escanearEste() != Espectro.VACIO);
			
			obstaculosDestruidos = obstaculosDestruidos + 1;	
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección OESTE de la misma.
	 */
	void destruirObstaculoAlOeste() {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al OESTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearOeste() != Espectro.DESCONOCIDO) && (radar.escanearOeste() != Espectro.VACIO)) {
		
			do {
				
				navePilotada.atacarAlOeste();
				
			} while (radar.escanearOeste() != Espectro.VACIO);
			
			obstaculosDestruidos = obstaculosDestruidos + 1;
		}
	}
}
