package es6;
/*     * ES6: Sistema di Prenotazione Hotel
     * 
     * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
     * associare clienti a prenotazioni e una lista di camere disponibili.
     * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
     * assicurandoti di gestire eccezioni come camere non disponibili o
     * cancellazioni tardive. */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrenotazioneHotel {

    Map<Cliente, Camera> prenotazioni;
    List<Camera> camere;

    public PrenotazioneHotel(List<Camera> camere) {
        this.camere = camere;
        this.prenotazioni = new HashMap<>();
    }

    public void prenota(Cliente cliente, Camera camera) throws Exception {
        if (prenotazioni.containsKey(cliente)) {
            throw new Exception("Cliente già prenotato");
        }
        if (prenotazioni.containsValue(camera)) {
            throw new Exception("Camera già prenotata");
        }
        System.out.println("Prenotazione effettuata a nome di: " + cliente.getNome() + " nella camera: " + camera.getNumeroCamera());
        prenotazioni.put(cliente, camera);
    }

    public void cancella(Cliente cliente) throws Exception {
        if (!prenotazioni.containsKey(cliente)) {
            throw new Exception("Cliente non prenotato");
        }
        System.out.println("Prenotazione cancellata a nome di: " + cliente.getNome() + " nella camera: " + prenotazioni.get(cliente).getNumeroCamera());
        prenotazioni.remove(cliente);
    }
    
}
