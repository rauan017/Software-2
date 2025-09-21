public class LandWeaponFactory {
    public LandWeapon createLandWeapon(String landWeaponType){
        if (landWeaponType.equalsIgnoreCase("Tank")){
            return new Tank();
        } else if (landWeaponType.equalsIgnoreCase("Pushka")) {
            return new Pushka();
        } else{
            throw new IllegalArgumentException(landWeaponType + " unknown weapon type");
        }
    }
}
