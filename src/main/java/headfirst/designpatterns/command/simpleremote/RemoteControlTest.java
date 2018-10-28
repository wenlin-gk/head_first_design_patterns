package headfirst.designpatterns.command.simpleremote;

import headfirst.designpatterns.command.simpleremote.command.GarageDoorOpenCommand;
import headfirst.designpatterns.command.simpleremote.command.LightOnCommand;
import headfirst.designpatterns.command.simpleremote.invoker.SimpleRemoteControl;
import headfirst.designpatterns.command.simpleremote.receiver.GarageDoor;
import headfirst.designpatterns.command.simpleremote.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();

		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
