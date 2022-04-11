package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

public class Ricerca { //in questa classe metto i metodi ricorsivi. Avrei potuti metterli in model comunque
	
	public List<Pos> trovaParola(String parola, Board board) {
		
		//inizio la rcorsione solo se trovo la prima lettera della parola
		for(Pos p: board.getPositions()){
			if(board.getCellValueProperty(p).get().charAt(0)==parola.charAt(0)) { //sono due caratteri e quindi posso usare ==. Inoltre per estrarre un carattere da una stringa uso il metodo 'charAt()'
				//posso far partire la ricorsione
				List<Pos> parziale= new ArrayList<Pos>();
				parziale.add(p);
				if(cerca(parola, parziale, 1, board))
					return parziale;
			}
		}
		return null;
	}
	
	public boolean cerca(String parola, List<Pos> percorso,  int livello, Board board) {
		
		//caso terminale
		if(livello==parola.length())
			return true;
		
		Pos ultima= percorso.get(percorso.size()-1);//ultima posizione inserita pr poi guardare le lettere adiacenti
		List<Pos> adiacenti = board.getAdjacencies(ultima); //lettere adiacenti all'ultima posizione
		for(Pos a: adiacenti) {
			if(!percorso.contains(a) && board.getCellValueProperty(a).get().charAt(0)==parola.charAt(livello)) {//se la posizione non è già contentuta nella lista di posizioni che abbiamo già usato
				percorso.add(a);
				if(cerca(parola, percorso, livello+1, board))// se mi ritorna vero vuol dire che ho trovato la parola; uscita rapida dalla ricorsione
					return true;
				percorso.remove(percorso.size()-1);
			}	
		}
		return false;
				
	}

}
