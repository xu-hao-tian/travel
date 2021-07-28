package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteDao {
    /**
     * 查询用户是否收藏
     * @param rid
     * @param uid
     * @return
     */
    public Favorite findByRidAndUid(int rid, int uid);

    /**
     * 查询收藏次数
     * @param rid
     */
    public int findCountByRid(int rid);

    public void add(int rid, int uid);
}
