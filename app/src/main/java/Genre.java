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


