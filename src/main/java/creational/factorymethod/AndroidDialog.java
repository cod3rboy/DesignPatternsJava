package creational.factorymethod;

/**
 * Concrete class of {@link Dialog} representing a windows dialog. This class provides a particular implementation of
 * factory method to create a {@link Button}.
 */
public class AndroidDialog extends Dialog{

    public AndroidDialog(String title, String message) {
        super(title, message);
    }

    /**
     * An implementation of factory method {@link Dialog#createButton()}
     * @return {@link AndroidButton}
     */
    @Override
    protected Button createButton() {
        return new AndroidButton(); // Creating an android style button
    }
}
