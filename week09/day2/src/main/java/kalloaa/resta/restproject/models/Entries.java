package kalloaa.resta.restproject.models;

import java.util.List;

public class Entries {
  private List<MyLog> entries;
  private int numberOfEntries;

  public Entries(List<MyLog> entries,int numberOfEntries) {
    this.entries = entries;
    this.numberOfEntries = numberOfEntries;
  }

  public Entries() {
  }

  public List<MyLog> getEntries() {
    return entries;
  }

  public void setEntries(List<MyLog> entries) {
    this.entries = entries;
  }

  public int getNumberOfEntries() {
    return numberOfEntries;
  }

  public void setNumberOfEntries(int numberOfEntries) {
    this.numberOfEntries = numberOfEntries;
  }
}
