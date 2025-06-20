package de.uni_hamburg.informatik.swt.se2.kino.ui.kasse;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstrakte Klasse Beobachtbar für die beobachtaren Klassen
 */
public abstract class Beobachtbar
{
    private Set<Beobachter> _beobachter;

    /**
     * Konstruktor von Beobachtbar
     */
    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    /**
     * fügt einen Beobachter der Liste hinzu
     * 
     * @param beobachter der zur Menge hinzuzuguegende Beobachter
     * @required beobachter != null
     */
    public void fuegeBeobachterHinzu(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(beobachter);
    }

    /**
     * entfernt einen Beobachter der Liste 
     * 
     * @param beobachter der zu entfernende beobachter
     * @required beobachter != null
     */
    public void entferneBeobachter(Beobachtbar beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.remove(beobachter);
    }

    /**
     * informiert alle Beobachter über eine Aenderung
     */
    public void meldeAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.beobachteAenderung(this);
        }
    }
}
