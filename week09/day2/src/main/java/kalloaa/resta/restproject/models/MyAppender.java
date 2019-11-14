package kalloaa.resta.restproject.models;

public class MyAppender {

  private String appended;

  public MyAppender(String appended) {
    this.appended = appended + "a";
  }

  public MyAppender() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
