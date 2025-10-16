public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        Device music = new MusicSystem();
        Device thermostat = new Thermostat();
        Device camera = new SecurityCamera();

        light = new EnergySavingDecorator(new VoiceControlDecorator(light));
        music = new RemoteAccessDecorator(new EnergySavingDecorator(music));
        thermostat = new EnergySavingDecorator(thermostat);
        camera = new RemoteAccessDecorator(camera);

        HomeAutomationFacade home = new HomeAutomationFacade(light, music, thermostat, camera);

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();
    }
}