package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;

import java.util.List;

public interface RouteDao {
    /**
     * 根据cid查询总记录数
     * @param cid
     * @return
     */
    public int findTotalCount(int cid,String rname);

    /**
     * 分页查询
     * @param cid
     * @param start
     * @param pageSize
     * @return
     */
    public List<Route> findByPage(int cid, int start, int pageSize,String sname);

    /**
     * 根据rid查询详情页面
     * @param rid
     * @return
     */
    public Route findOne(int rid);
}
