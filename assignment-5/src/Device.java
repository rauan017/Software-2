interface Device {
    String operate();
    void on();
    void off();
}

class Light implements Device {
    private boolean on;
    @Override public void on() { on = true; }
    @Override public void off() { on = false; }
    @Override public String operate() {
        return on ? "Light: ON" : "Light: OFF";
    }
}

class MusicSystem implements Device {
    private boolean playing;
    @Override public void on() { playing = true; }
    @Override public void off() { playing = false; }
    @Override public String operate() {
        return playing ? "MusicSystem: PLAYING music" : "MusicSystem: STOPPED";
    }
}

class Thermostat implements Device {
    private String mode = "comfort";
    @Override public void on() { mode = "comfort"; }
    @Override public void off() { mode = "eco"; }
    @Override public String operate() {
        return "Thermostat mode: " + mode;
    }
}

class SecurityCamera implements Device {
    private boolean enabled;
    @Override public void on() { enabled = true; }
    @Override public void off() { enabled = false; }
    @Override public String operate() {
        return enabled ? "SecurityCamera: ACTIVE" : "SecurityCamera: OFF";
    }
}
