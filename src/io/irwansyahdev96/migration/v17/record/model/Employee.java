package io.irwansyahdev96.migration.v17.record.model;

public class Employee {
    private String id;
    private String fullName;
    private Position position;

    public Employee(String id, String fullName, Position position) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
    }

    public Employee(String id, String fullName, String positionId) {
        this.id = id;
        this.fullName = fullName;
        this.position = new Position(positionId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
