package kalloaa.resta.restproject.models;

public class MyNumber {

  private int received;
  private int result;

  public MyNumber(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public MyNumber() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
