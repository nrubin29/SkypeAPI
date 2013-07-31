package me.pogostick29.skypeapi;

import java.util.ArrayList;

public class Group {

    private String topic;
    private ArrayList<User> users = new ArrayList<User>();

    protected Group(String topic, String... names) {
        this.topic = topic;

        for (String user : names) users.add(new User(user));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void call(CallType type) {
        String uri = "";
        for (User user : users) uri += user.getName() + ";";
        uri = uri.substring(0, uri.lastIndexOf(";"));
        uri += "?call&video=" + type.isVideo() + "&topic=" + topic.replaceAll(" ", "%20");
        SkypeAPI.openURI(uri);
    }

    public void chat() {
        String uri = "";
        for (User user : users) uri += user.getName() + ";";
        uri = uri.substring(0, uri.lastIndexOf(";"));
        uri += "?chat&topic=" + topic.replaceAll(" ", "%20");
        SkypeAPI.openURI(uri);
    }
}