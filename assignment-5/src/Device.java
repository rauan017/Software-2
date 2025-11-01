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
    private int temperature = 25;
    private String mode = "comfort";
    private boolean onn = false;

    @Override public void on(){
        on = true;
        System.out.println("Gradus:" + temperature);
    }
    @Override public void off(){
        on = false;
        System.out.println("Thermo is off");
    }

    public void setTemperature(int newTemp ){
        if(on){
            temperature = newTemp;
            System.out.println("Thermo changed to " + temperature + "gradus");
        }else{
            System.out.println("Thermostat is off");
        }
    }


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
