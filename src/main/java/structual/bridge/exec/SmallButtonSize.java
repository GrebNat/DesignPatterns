package structual.bridge.exec;

public class SmallButtonSize implements ButtonSize {
    @Override
    public void setSize(Button button) {
        System.out.println("Setting size to small...");
    }
}
