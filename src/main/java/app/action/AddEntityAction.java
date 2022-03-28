package app.action;

import app.entity.AddEntity;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class AddEntityAction extends AnAction
{
    private AddEntity addEntity;
    public AddEntityAction()
    {
        addEntity=new AddEntity();
    }
    public void actionPerformed(@NotNull AnActionEvent e)
    {
        String entityPackageName=Messages.showInputDialog("Enter entity package","Add Entity",Messages.getQuestionIcon());
        String entityName=Messages.showInputDialog("Enter entity name","Add Entity",Messages.getQuestionIcon());
        try
        {
            addEntity.add(e.getProject().getBasePath(),entityName,entityPackageName);
            Messages.showInfoMessage("Added","Success");
        }
        catch(IOException ex)
        {
            Messages.showInfoMessage(ex.getMessage(),"Error");
        }
    }
}