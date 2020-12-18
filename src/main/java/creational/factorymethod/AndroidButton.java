package creational.factorymethod;

/**
 * Implementation of an abstract {@link Button} class. This implementation represents an android style button.
 */
public class AndroidButton extends Button{
    @Override
    public void render() {
        System.out.println("ANDROID BUTTON");
    }

    @Override
    public void click() {
        System.out.println("You clicked android button");
    }
}
