package DesignPatterns.behavioural.command;

/*
Command3.java

Command can also support undo.
*/
public class Command3 {
    public static void main(String[] args) {
        Light3 light = new Light3();
        CommandAction3 command = new LightOnCommand3(light);

        RemoteControl3 remote = new RemoteControl3();
        remote.setCommand(command);
        remote.pressButton();
        remote.pressUndo();
    }
}

interface CommandAction3 {
    void execute();

    void undo();
}

class Light3 {
    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class LightOnCommand3 implements CommandAction3 {
    private final Light3 light;

    public LightOnCommand3(Light3 light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

class RemoteControl3 {
    private CommandAction3 command;

    public void setCommand(CommandAction3 command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
