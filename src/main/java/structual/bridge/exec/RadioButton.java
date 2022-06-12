package structual.bridge.exec;

public class RadioButton extends Button {

  ButtonSize buttonSize;

  public RadioButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setSize(this);
    System.out.println("Drawing a radio button.\n");
  }

}
