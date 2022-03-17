package textAdventure;

public class GameEngine {

    final UserInterface ui = new UserInterface();

    public void go() {

        ui.welcomeMessage();
        ui.playerOptions();

    }
}
