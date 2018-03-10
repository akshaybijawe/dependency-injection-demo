package com.akshaybijawe.examplebeans;

/**
 * @author arbijawe on 3/10/18
 * @project dependency-injection-demo
 */

public class FakeDataSource {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
