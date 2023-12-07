package GOF.Command.TextEditorExample;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) {
            return false; // Disable copy when no text is selected
        }

        editor.clipboard = editor.textField.getSelectedText();
        return true;
    }
    
    @Override
    public void undo() {
        // For undoing copy, clearing clipboard
        editor.clipboard = null;
    }
}
