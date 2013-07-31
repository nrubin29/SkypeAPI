package me.nrubin29.skypeapi;

public class User {

    private String name;

    protected User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call(CallType type) {
        SkypeAPI.openURI(name + "?call&video=" + type.isVideo());
    }

    public void chat() {
        SkypeAPI.openURI(name + "?chat");
    }
}