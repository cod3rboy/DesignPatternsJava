package creational.factorymethod;

/**
 * Abstract Button class declaring methods common to all kinds of buttons
 */
public abstract class Button {
    public abstract void render(); // Used to render button ui
    public abstract void click(); // Used to trigger button click
}
