package creational.factorymethod;

/**
 * Implementation of an abstract {@link Button} class. This implementation represents a windows style button.
 */
public class WindowsButton extends Button{
    @Override
    public void render() {
        System.out.println("WINDOWS BUTTON");
    }

    @Override
    public void click() {
        System.out.println("You clicked windows button");
    }
}
