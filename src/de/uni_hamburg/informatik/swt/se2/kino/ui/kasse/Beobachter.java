package de.uni_hamburg.informatik.swt.se2.kino.ui.kasse;

/**
 * Interface für Beobachter
 * 
 */
public interface Beobachter
{

    /**
     * nimmt eine Änderung wahr
     * 
     * @param object, das Objekt auf das reagiert werden soll
     * @required object != null
     */
    void beobachteAenderung(Object object);
}
