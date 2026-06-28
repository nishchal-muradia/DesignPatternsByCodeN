package DesignPatterns.behavioural.command;

/*
Command2.java

Now action is wrapped inside Command2 interface.

Remote only knows Command2.
It does not care whether command controls light, fan, or music.
*/
public class Command2 {
    public static void main(String[] args) {
        Light2 light = new Light2();
        CommandAction2 command = new LightOnCommand2(light);

        RemoteControl2 remote = new RemoteControl2();
        remote.setCommand(command);
        remote.pressButton();
    }
}

interface CommandAction2 {
    void execute();
}

class Light2 {
    public void turnOn() {
        System.out.println("Light ON");
    }
}

class LightOnCommand2 implements CommandAction2 {
    private final Light2 light;

    public LightOnCommand2(Light2 light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class RemoteControl2 {
    private CommandAction2 command;

    public void setCommand(CommandAction2 command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
