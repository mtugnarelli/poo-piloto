
class Piloto {
	
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
	int avanzarAlNorteHastaObstaculo(Nave navePilotada) {
		
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
	int avanzarAlSurHastaObstaculo(Nave navePilotada) {
		
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
	int avanzarAlEsteHastaObstaculo(Nave navePilotada) {
		
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
	int avanzarAlOesteHastaObstaculo(Nave navePilotada) {
		
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
	void destruirObstaculoAlNorte(Nave navePilotada) {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al NORTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearNorte() != Espectro.DESCONOCIDO) && (radar.escanearNorte() != Espectro.VACIO)) {
			
			while (radar.escanearNorte() != Espectro.VACIO) {
				
				navePilotada.atacarAlNorte();
			}

			obstaculosDestruidos = obstaculosDestruidos + 1; 
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección SUR de la misma.
	 */
	void destruirObstaculoAlSur(Nave navePilotada) {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al SUR es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearSur() != Espectro.DESCONOCIDO) && (radar.escanearSur() != Espectro.VACIO)) {
			
			while (radar.escanearSur() != Espectro.VACIO) {
				
				navePilotada.atacarAlSur();
			}
			
			obstaculosDestruidos = obstaculosDestruidos + 1; 
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección ESTE de la misma.
	 */
	void destruirObstaculoAlEste(Nave navePilotada) {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al ESTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearEste() != Espectro.DESCONOCIDO) && (radar.escanearEste() != Espectro.VACIO)) {
		
			while (radar.escanearEste() != Espectro.VACIO) {
				
				navePilotada.atacarAlEste();
			}
			
			obstaculosDestruidos = obstaculosDestruidos + 1;	
		}
	}
	
	/*
	 * pre : navePilotada ha despegado de la Base.
	 * post: el Piloto utiliza navePilotada para atacar hasta destruir la Pieza
	 *       que ocupa el Casillero contiguo en dirección OESTE de la misma.
	 */
	void destruirObstaculoAlOeste(Nave navePilotada) {
		
		Radar radar = navePilotada.getRadar();
		
		/* si el Radar indica que lo que se encuentra al OESTE es DESCONOCIDO, 
		 * no puede ser destruido */
		if ((radar.escanearOeste() != Espectro.DESCONOCIDO) && (radar.escanearOeste() != Espectro.VACIO)) {
		
			while (radar.escanearOeste() != Espectro.VACIO) {
				
				navePilotada.atacarAlOeste();
			}
			
			obstaculosDestruidos = obstaculosDestruidos + 1;
		}
	}
}
