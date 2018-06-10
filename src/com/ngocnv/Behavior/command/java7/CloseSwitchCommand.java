package com.ngocnv.Behavior.command.java7;

public class CloseSwitchCommand implements ICommand {

    private ISwitchable iSwitchable;

    public CloseSwitchCommand(ISwitchable iSwitchable) {
        this.iSwitchable = iSwitchable;
    }

    @Override
    public void execute() {
        iSwitchable.powerOff();
    }
}
