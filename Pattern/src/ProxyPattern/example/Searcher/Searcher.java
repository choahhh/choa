package ProxyPattern.example.Searcher;

/**
 * 抽象查询类，充当了抽象主题角色，它声明了DoSearch（）方法。
 */
public interface Searcher {
    String DoSearch(String userId,String keyWord);
}
