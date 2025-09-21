public interface AirWeapon {
    String getName();
}

class Jet implements AirWeapon{
    public String getName(){
        return "Jet";
    }
}

class Helicopter implements AirWeapon{
    public String getName(){
        return "Helicopter";
    }
}


