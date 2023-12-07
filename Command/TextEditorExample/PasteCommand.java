package GOF.Command.TextEditorExample;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false; // Disable paste when clipboard is empty
        }

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }

    @Override
    public void undo() {
        // For undoing paste, cutting the pasted content
        CutCommand cutCommand = new CutCommand(editor);
        cutCommand.execute();
    }
}
