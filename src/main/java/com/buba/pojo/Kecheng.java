package com.buba.pojo;


import java.util.List;

public class Kecheng {

  private long id;
  private String keName;

  private List<Classes> classesList;

  public List<Classes> getClassesList() {
    return classesList;
  }

  public void setClassesList(List<Classes> classesList) {
    this.classesList = classesList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getKeName() {
    return keName;
  }

  public void setKeName(String keName) {
    this.keName = keName;
  }
}
