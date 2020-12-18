package creational.factorymethod;

public class MainClass {
    enum Environment {
        WINDOWS, WEB, ANDROID
    }

    public static void main(String... args) {
        Environment currentEnvironment = Environment.ANDROID;
        Dialog dialog = getDialog(currentEnvironment);
        dialog.render();
        dialog.pressOk();
    }

    private static Dialog getDialog(Environment currentEnvironment) {
        Dialog dialog = null;
        switch (currentEnvironment) { // Determine concrete factory class based on some global parameter
            case WEB:
                dialog = new HTMLDialog("An HTML Dialog", "Welcome to HTML");
                break;
            case ANDROID:
                dialog = new AndroidDialog("An Android Dialog", "Welcome to Android");
                break;
            case WINDOWS:
                dialog = new WindowsDialog("A Windows Dialog", "Welcome to Windows");
        }
        return dialog;
    }
}
