public class AirWeaponFactory {
    public AirWeapon createAirWeapon(String airWeaponType) {
        if (airWeaponType.equalsIgnoreCase("Jet")) {
            return new Jet();
        } else if (airWeaponType.equalsIgnoreCase("Helicopter")) {
            return new Helicopter();
        } else {
            throw new IllegalArgumentException(airWeaponType + " unknown weapon type");
        }
    }
}
