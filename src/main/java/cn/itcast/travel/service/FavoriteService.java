package cn.itcast.travel.service;

public interface FavoriteService {
    /**
     * 查询是否收藏
     * @param rid
     * @param uid
     * @return
     */
    public boolean isFavorite(String rid,int uid);

    public void add(String rid, int uid);
}
