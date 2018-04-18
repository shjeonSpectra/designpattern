package talk.process;

public class Account
{
    Action action;

    public Account(Action action, String role)
    {
        this.action = action;
    }

    public void accountAction()
    {
        action.doAction();
    }

}
