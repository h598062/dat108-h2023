package no.hvl.dat108;

public enum BmiVektklasse {
    UNDERVEKT, NORMALVEKT, OVERVEKT, HELSESKADELIG_OVERVEKT;

    @Override 
    public String toString() {
        return name().toLowerCase();
      }
}
