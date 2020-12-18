package creational.factorymethod;

/**
 * Concrete class of {@link Dialog} representing a windows dialog. This class provides a particular implementation of
 * factory method to create a {@link Button}.
 */
public class WindowsDialog extends Dialog{

    public WindowsDialog(String title, String message) {
        super(title, message);
    }

    /**
     * An implementation of factory method {@link Dialog#createButton()}
     * @return {@link WindowsButton}
     */
    @Override
    protected Button createButton() {
        return new WindowsButton(); // Creating a windows style button
    }
}
