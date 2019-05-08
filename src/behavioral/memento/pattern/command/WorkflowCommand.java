package behavioral.memento.pattern.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
