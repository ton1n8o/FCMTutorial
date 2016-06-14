package tntstudios.com.br.firebasecloudmessaging.fcm;

public class NotificationData {

    public static final String TEXT = "TEXT";

    private String imageName;
    private int id; // identificador da notificação
    private String title;
    private String textMessage;
    private String sound;

    public NotificationData() {}

    public NotificationData(String imageName, int id, String title, String textMessage, String sound) {
        this.imageName = imageName;
        this.id = id;
        this.title = title;
        this.textMessage = textMessage;
        this.sound = sound;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
