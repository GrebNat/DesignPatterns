package structual.bridge.exec;

public class MediumButtonSize implements ButtonSize {
    @Override
    public void setSize(Button button) {
        System.out.println("Setting size to mediumSmallButtonSize...");
    }
}
