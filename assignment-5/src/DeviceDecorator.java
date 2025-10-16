abstract class DeviceDecorator implements Device {
    protected final Device device;
    public DeviceDecorator(Device device) { this.device = device; }

    @Override public void on() { device.on(); }
    @Override public void off() { device.off(); }
    @Override public String operate() { return device.operate(); }
}

class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device d) { super(d); }
    @Override public String operate() {
        return super.operate() + " + Voice Control";
    }
}

class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device d) { super(d); }
    @Override public String operate() {
        return super.operate() + " + Energy Saving Mode";
    }
}

class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device d) { super(d); }
    @Override public String operate() {
        return super.operate() + " + Remote Access";
    }
}
