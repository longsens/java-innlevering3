package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
        nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {

        if(finnInnlegg(innlegg) != -1) {
            return true;
        }
        return false;
	}

	public boolean ledigPlass() {
        if(nesteledig < innleggtabell.length) {
            return true;
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

            if(ledigPlass() != false && finnes(innlegg) == false) {
                innleggtabell[nesteledig] = innlegg;
                nesteledig++;
                return true;
            }
        return false;
	}
	
	public String toString() {
        String innlegg = nesteledig + "\n";
        for(int i = 0; i < nesteledig; i++) {
            innlegg += innleggtabell[i].toString();
        }
        return innlegg;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}