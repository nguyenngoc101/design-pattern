package com.ngocnv.Behavior.command.java7;

// Invoker class
public class Switch {
    private ICommand closedCommand;
    private ICommand openedCommand;

    public Switch(ICommand closedCommand, ICommand openedCommand) {
        this.closedCommand = closedCommand;
        this.openedCommand = openedCommand;
    }

    //close the circuit/power on
    public void Close()
    {
        this.closedCommand.execute();
    }

    //open the circuit/power off
    public void Open()
    {
        this.openedCommand.execute();
    }
}
