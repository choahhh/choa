package CommandPattern.example.Command;

import CommandPattern.example.Handler.HelpHandler;

//帮助命令类
public class HelpCommand extends Command{
    private HelpHandler hhobj;//维持对请求接受者的引用
    public HelpCommand(){
        hhobj = new HelpHandler();
    }
    //命令执行方法，将调用请求接收者的业务方法
    public void execute(){
        hhobj.display();
    }
}
