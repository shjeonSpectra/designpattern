package talk.process;

public abstract class TalkMessage {
    private String type;
    private String message;
    private String path;

    public abstract String sendMessage (String text);

    public abstract void push();


}
