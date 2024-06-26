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
public class CameraSingola extends CameraAlbergo {

    public CameraSingola(int numeroLetti, int numeroCamera) {
        super(numeroLetti, numeroCamera);
    }

    @Override
    public int calcolaCosto() {
        return 40 * numeroLetti();
    }

    @Override
    public int numeroLetti() {
        return super.numeroLetti;
    }

    @Override
    public String toString() {
        return "CameraSingola n. " + getNumeroCamera() + " con " + numeroLetti() + " letti. Costo: " + calcolaCosto() + " euro.";
    }
}
