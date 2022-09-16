package org.example;

public class Connection {
    private final String url;
    private final String login;
    private final String pass;

    public Connection(String url, String login, String pass) {
        this.url = url;
        this.login = login;
        this.pass = pass;
    }

    public boolean getConnection() {
        sleep(1500);
        System.out.println("Connected...");
        return true;
    }

    private void sleep(long value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void open() {
        System.out.println("Open session...");
    }

    public void close() {
        System.out.println("Close session...");
    }
}
