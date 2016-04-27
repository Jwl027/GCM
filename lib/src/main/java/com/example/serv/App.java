package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDcy0rudA8nu2TiapHiLZNF265v3KgCbLI";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();
// 21
        c.addRegId("APA91bF9L_OpIZQ9t4CLTPsI9Af1SHE1SyIMRxEiCf3LvnySRt-13he5SjRtfcJ17jCGLl-phemW3VG83aw1jeRR36F-_BqubhYpPu4xkEHOCKiVoK10VBXz4m1cjV67VnNL8vzLH7tC");

        c.createData("Working!!", "Test message");

        return c;
    }
}

