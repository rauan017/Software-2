class HomeAutomationFacade {
    private final Device light, music, thermostat, camera;

    public HomeAutomationFacade(Device light, Device music, Device thermostat, Device camera) {
        this.light = light;
        this.music = music;
        this.thermostat = thermostat;
        this.camera = camera;
    }

    public void startPartyMode() {
        System.out.println("\n startPartyMode()");
        light.on();
        music.on();
        thermostat.on();
        camera.off();
        printStatus();
    }

    public void activateNightMode() {
        System.out.println("\n activateNightMode()");
        light.off();
        music.off();
        thermostat.off();
        camera.on();
        printStatus();
    }

    public void leaveHome() {
        System.out.println("\n leaveHome()");
        light.off();
        music.off();
        thermostat.off();
        camera.on();
        printStatus();
    }

    private void printStatus() {
        System.out.println(light.operate());
        System.out.println(music.operate());
        System.out.println(thermostat.operate());
        System.out.println(camera.operate());
    }
}


