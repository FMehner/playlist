/**
 * Repräsentiert die verfügbaren Musikgenres.
 *
 * <p>Jedes Genre besitzt eine Beschreibung, einen Energiemultiplikator
 * zur Berechnung der Song-Energie sowie ein Symbol für die Darstellung.
 */
public enum Genre {
    POP("Pop", 1.0, "[P]"),
    ROCK("Rock", 1.5, "[R]"),
    CLASSICAL("Klassik", 0.5, "[C]"),
    HIP_HOP("Hip-Hop", 2.0, "[H]"),
    ELECTRONIC("Elektronisch", 1.75, "[E]");

    private final String description;
    private final double energyMultiplier;
    private final String symbol;

    //Constructor
    Genre(String description, double energyMultiplier, String symbol){
        this.description = description;
        this.energyMultiplier = energyMultiplier;
        this.symbol = symbol;
    }


    //Getter
    public String getDescription(){
        return description;
    }
    public double getEnergyMultiplier(){
        return energyMultiplier;
    }
    public String getSymbol(){
        return symbol;
    }

    /**
     * Berechnet die Energie eines Songs basierend auf seiner Dauer
     * und dem Energiemultiplikator des Genres.
     *
     * @param durationSeconds Dauer des Songs in Sekunden, must be > {@code 0}
     * @return die berechnete Energie als ganzzahliger Wert
     * @throws IllegalArgumentException wenn {@code durationSeconds < = 0}
     */
    public int getEnergyForDuration(int durationSeconds){
        //Exceptions for illegal input
        if (durationSeconds == 0){
            throw new IllegalArgumentException("duration 0 is not allowed");
        }
        if (durationSeconds < 0){
            throw new IllegalArgumentException("negative duration is not allowed");
        }

        return (int) Math.round(durationSeconds * energyMultiplier / 60.0);
    }
}


