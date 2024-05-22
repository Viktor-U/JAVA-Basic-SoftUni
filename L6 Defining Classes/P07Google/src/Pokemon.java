public class Pokemon{
    private String pokemonName;
    private String pokemonType;

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return String.format("%s %s", pokemonName, pokemonType);
    }
}