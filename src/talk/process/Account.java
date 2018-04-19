package talk.process;

import talk.strategy.*;

import java.util.ArrayList;

public class Account
{
    ArrayList<Action> actionList = null;

    public Account()
    {

    }

    public Account(String roleId)
    {
        actionList = new  ArrayList<Action>();

        switch (roleId)
        {
            case "admin" :  // 관리자는 매니저 업무도 포함한다.
                setAction(new Notice());
            case "manager" : // 매니저는 최대동시상담수, 상담인입차단, 최대 대기수 조정 가능
                setAction(new Block());
                setAction(new ChangeMaxWaitCount());
            case "agent" : // 상담원은 최대동시상담수만 변경 가능
                setAction(new ChangeMaxConCount());
                break;
        }
    }

    public void setAction (Action action)
    {
        actionList.add(action);
    }

    public void actionByRole()
    {
        Action action = null;
        for (int i=0; i<actionList.size(); i++)
        {
            action = actionList.get(i);
            action.doAction();
        }

    }



}
