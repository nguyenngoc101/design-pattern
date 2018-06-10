package com.ngocnv.Behavior.command.java7;

public class OpenSwitchCommand implements ICommand {

    private ISwitchable iSwitchable;

    public OpenSwitchCommand(ISwitchable iSwitchable) {
        this.iSwitchable = iSwitchable;
    }

    @Override
    public void execute() {
        iSwitchable.powerOn();
    }
}
