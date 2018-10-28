package command.simpleremote;

import command.simpleremote.command.GarageDoorOpenCommand;
import command.simpleremote.command.LightOnCommand;
import command.simpleremote.invoker.SimpleRemoteControl;
import command.simpleremote.receiver.GarageDoor;
import command.simpleremote.receiver.Light;

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
