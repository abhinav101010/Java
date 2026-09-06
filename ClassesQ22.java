abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
}

interface Connectable {
    void connect();
}

class SmartPhone extends SmartDevice implements Connectable {
    @Override
    void turnOn() {
        System.out.println("SmartPhone is turning on");
    }
    @Override
    void turnOff() {
        System.out.println("SmartPhone is turning off");
    }
    @Override
    public void connect() {
        System.out.println("SmartPhone is connecting");
    }
}

class SmartWatch extends SmartDevice implements Connectable {
    @Override
    void turnOn() {
        System.out.println("SmartWatch is turning on");
    }
    @Override
    void turnOff() {
        System.out.println("SmartWatch is turning off");
    }
    @Override
    public void connect() {
        System.out.println("SmartWatch is connecting");
    }
}

public class ClassesQ22 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();
        phone.turnOn();
        phone.connect();
        phone.turnOff();
        watch.turnOn();
        watch.connect();
        watch.turnOff();
    }
}