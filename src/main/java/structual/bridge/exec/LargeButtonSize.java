package structual.bridge.exec;

public class LargeButtonSize implements ButtonSize {
    @Override
    public void setSize(Button button) {
        System.out.println("Setting size to large...");
    }
}
