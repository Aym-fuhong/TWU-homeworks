package models;

public class User {
    private int id;
    private String name;
    private String password;
    private String phone;
    private String type;

    public User(int id, String name, String password, String phone, String type) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.type = type;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getType() {
        return type;
    }
}
