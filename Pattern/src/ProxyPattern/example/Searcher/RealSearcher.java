package ProxyPattern.example.Searcher;

/**
 * 具体查询类，充当真实主题角色，它实现查询功能，提供DoSearch来查询信息。
 */
public class RealSearcher implements Searcher {
    /**
     * 模拟查询商务信息
     * @param userId
     * @param keyWord
     * @return
     */
    @Override
    public String DoSearch(String userId, String keyWord) {
        System.out.println("用户" + userId + "使用关键词" + keyWord + "查询商务信息！");

        return "返回具体内容";
    }
}
