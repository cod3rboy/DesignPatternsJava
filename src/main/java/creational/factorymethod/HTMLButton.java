package creational.factorymethod;

/**
 * Implementation of abstract {@link Button} class. This implementation represents an HTML style button.
 */
public class HTMLButton extends Button{

    @Override
    public void render() {
        System.out.println("<button>HTML BUTTON</button>");
    }

    @Override
    public void click() {
        System.out.println("You clicked an HTML Button");
    }
}
