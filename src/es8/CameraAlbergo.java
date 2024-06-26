package es8;

/* 
 * ES8: Sistema di Prenotazione Alberghiera
     * 
     * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto() e
     * numeroLetti(). Deriva da questa diverse classi specifiche come CameraSingola,
     * CameraDoppia e Suite. Implementa calcolaCosto in modo diverso per ogni tipo
     * di camera. Utilizza una collezione per gestire tutte le camere disponibili in
     * un albergo.
*/

/*
 * supponiamo che la camera singola costa 50 euro per letto,
 */
public abstract class CameraAlbergo {
    public int numeroLetti;
    public int numeroCamera;

    public CameraAlbergo(int numeroLetti, int numeroCamera) {
        this.numeroLetti = numeroLetti;
        this.numeroCamera = numeroCamera;
    }

    // metodi astratti
    public abstract int calcolaCosto();
    public abstract int numeroLetti();
    public abstract String toString();

    public int getNumeroCamera() {
        return numeroCamera;
    }

    

}
