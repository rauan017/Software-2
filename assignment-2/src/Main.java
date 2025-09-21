public class Main {
    public static void main(String[] args) {
        System.out.println("🏭Factory Method🏭");
        AirWeaponFactory airWeaponFactory = new AirWeaponFactory();
        LandWeaponFactory landWeaponFactory = new LandWeaponFactory();

        AirWeapon airWeapon = airWeaponFactory.createAirWeapon("Jet");
        LandWeapon landWeapon = landWeaponFactory.createLandWeapon("Tank");

        System.out.println( airWeapon.getName() + " + " + landWeapon.getName() + '\n');

        System.out.println("👉Abstract Factory👈");
        WeaponFactory cheapWeapon = new CheapWeaponFactory();

        AirWeapon cheapAirWeapon = cheapWeapon.createAirWeapon();
        LandWeapon cheapLandWeapon = cheapWeapon.createLandWeapon();

        System.out.println("Cheap Weapon: " + cheapAirWeapon.getName() + " + " + cheapLandWeapon.getName());

    }
}