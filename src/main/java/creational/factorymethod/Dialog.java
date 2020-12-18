package creational.factorymethod;

/**
 * An abstract class for all kinds of dialog.
 * The implementations of {@link Dialog} creates particular kind of button matching the creating dialog.
 */
public abstract class Dialog {
    private String title;
    private String message;
    private Button button;

    public Dialog(String title, String message) {
        this.title = title;
        this.message = message;
        this.button = createButton();
    }

    public void render() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Title : " + title);
        System.out.println("Message : " + message);
        System.out.println("Button :-");
        button.render();
    }

    public void pressOk() {
        button.click();
    }

    /**
     * Factory method to create a particular kind of button.
     *
     * @return an implementation of {@link Button}
     */
    protected abstract Button createButton();
}
