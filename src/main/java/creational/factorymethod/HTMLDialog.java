package creational.factorymethod;

/**
 * Concrete class of {@link Dialog} representing an HTML dialog. This class provides a particular implementation of
 * factory method to create a {@link Button}.
 */
public class HTMLDialog extends Dialog{

    public HTMLDialog(String title, String message) {
        super(title, message);
    }

    /**
     * Implementation of factory method {@link Dialog#createButton()}
     * @return {@link HTMLButton}
     */
    @Override
    protected Button createButton() {
        return new HTMLButton(); // Creating an HTML style button
    }
}
