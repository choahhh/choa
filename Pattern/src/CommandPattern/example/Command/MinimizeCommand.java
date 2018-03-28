package CommandPattern.example.Command;

import CommandPattern.example.Handler.WindowHanlder;

//最小化命令类
public class MinimizeCommand extends Command{
    private WindowHanlder whobj;//维持对请求接收者的引用
    public MinimizeCommand(){
        whobj = new WindowHanlder();
    }
    //命令执行方法，将调用请求接收者业务方法
    public void execute(){
        whobj.minimize();
    }
}
