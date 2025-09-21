 interface WeaponFactory {
    AirWeapon createAirWeapon();
    LandWeapon createLandWeapon();
}

class CheapWeaponFactory implements WeaponFactory {
    private final AirWeaponFactory airWeaponFactory = new AirWeaponFactory();
    private final LandWeaponFactory landWeaponFactory = new LandWeaponFactory();

    public AirWeapon createAirWeapon(){
        return airWeaponFactory.createAirWeapon("Helicopter");
    }

    public LandWeapon createLandWeapon(){
        return landWeaponFactory.createLandWeapon("Pushka");
    }
}
