package Entity;

import java.util.Date;

public class EmployeeDTO {

  private int id;
  private String name;
  private Date startDt;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
