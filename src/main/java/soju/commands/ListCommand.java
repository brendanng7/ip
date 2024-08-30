package soju.commands;

import soju.Storage;
import soju.TaskList;
import soju.Ui;

/**
 * ListCommand handles commands starting with list
 */
public class ListCommand extends Command {
    public ListCommand(String input) {
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printString("Here are the tasks in your list:");
        ui.printString(tasks.toString());
    }
}
