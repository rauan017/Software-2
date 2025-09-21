
public interface LandWeapon {
    String getName();
}

class Tank implements LandWeapon{
    public String getName(){
        return "Tank";
    }
}

class Pushka implements LandWeapon{
    public String getName(){
        return "Pushka";
    }
}