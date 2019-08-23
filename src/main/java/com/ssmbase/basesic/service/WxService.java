package com.ssmbase.basesic.service;

import com.ssmbase.basesic.dao.WxMenuMapper;
import com.ssmbase.basesic.model.WxMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxService {

    @Autowired
    WxMenuMapper wxMenuMapper;

    /**
     * 查询菜单信息
     * @param wxMenu
     * @return
     */
    public List<WxMenu> QueryMenu(WxMenu wxMenu){
      return   wxMenuMapper.queryWxMenu(wxMenu);
    }

    /**
     * 新增菜单信息
     * @param wxMenu
     */
    public int insert(WxMenu wxMenu){
       return wxMenuMapper.insert(wxMenu);
    }

    /**
     * 新增菜单
     * @param wxMenu
     */
    public int insertSelective(WxMenu wxMenu){
      return   wxMenuMapper.insertSelective(wxMenu);
    }

    /**
     * 根据字段修改
     * @param wxMenu
     */
    public int updateByPrimaryKeySelective(WxMenu wxMenu){
       return wxMenuMapper.updateByPrimaryKeySelective(wxMenu);
    }

    /**
     * 全字段更新
     * @param wxMenu
     */
    public int  updateByPrimaryKey(WxMenu wxMenu){
      return  wxMenuMapper.updateByPrimaryKey(wxMenu);
    }

    /**
     * 根据主键id删除菜单信息
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(int id){
      return   wxMenuMapper.deleteByPrimaryKey(id);
    }
}
