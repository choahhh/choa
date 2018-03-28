package ProxyPattern.example.Searcher;

import ProxyPattern.example.AccessValidator;
import ProxyPattern.example.Logger;

/**
 * 代理查询类，充当代理主题角色，它是查询代理，维持了对RealSearcher对
 * 象、AccessValidator对象和Logger对象的引用。
 */
public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator  validator;
    private Logger logger;
    public String DoSearch(String userId,String keyWord){
        //如果身份验证成功，则执行查询
        if(this.Validate(userId)){
            String result  = searcher.DoSearch(userId,keyWord);
            this.Log(userId);//记录查询日志
            return result;//返回查询结果
        } else {
            return null;
        }
    }
    //创建访问验证对象并调用Validator（）方法实现身份验证
    public boolean Validate(String userId){
        validator = new AccessValidator();
        return validator.Validate(userId);
    }
    //创建日志记录对象并调用其Log（）方法实现日志记录
    public void Log(String userId){
        logger = new Logger();
        logger.Log(userId);
    }
}
