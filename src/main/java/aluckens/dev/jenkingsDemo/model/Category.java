package aluckens.dev.jenkingsDemo.model;

import aluckens.dev.jenkingsDemo.model.enumeration.Type;

import java.time.LocalDateTime;
import java.util.Random;

public class Category {
  private Integer id;
  private String name;
  private Type type;
  private LocalDateTime createdOn;
  private String createdBy;

  public Category(String name, Type type) {
    this.id = new Random().nextInt();
    this.name = name;
    this.type = type;
    this.createdOn = LocalDateTime.now();
    this.createdBy = "Admin";
  }
  public Category(Integer id , String name, Type type) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.createdOn = LocalDateTime.now();
    this.createdBy = "Admin";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
