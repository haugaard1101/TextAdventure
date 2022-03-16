package TextAdventure;

public class GameEngine {

    UserInterface ui = new UserInterface();

    public void go() {

        ui.welcomeMessage();
        ui.playerOptions();
    }
}
