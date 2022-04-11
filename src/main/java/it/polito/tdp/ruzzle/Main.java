package it.polito.tdp.ruzzle;

public class Main {
	public static void main(String[] args) {
        EntryPoint.main(args);
    }
}


/*INPUT PROBLEMA:
 * -stringa da riconoscere 'parola'
 * -contenuto della board
 * -posizione della prima lettera
 * 
 *  SOLUZIONE PARZIALE:
 *  -una stringa, la parte della 'parola' che ho già riconsciuto
 *  -Elenco delle posizioni delle lettere
 *  
 *  SOLUZIONE TOTALE: 
 *  -la parola riconosciuta per intero
 *  -Elenco delle posizioni delle lettere
 *  
 *  LIVELLO RICORSIONE:
 *  -il numero di caratteri riconosciuti
 *  
 *  CONDIZIONI DI TERMINAZIONE:
 *  -livello== lunghezza della parola da riconoscere
 *  -se viene trovata 'parola' stoppo ricorsione
 *  
 *  AVVIO RICORSIONE:
 *  -livello=1
 *  -parto dalla posizione della prima letterea (se c'è)
 *  
 *  STRUTTURE DATI:
 *  -Stringa (parziale)
 *  -int (livello)
 *  -List<Pos> (parziale, il percorso)
 *  */
 