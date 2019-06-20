package com.xiao.zdhospital.vo;

import java.util.List;

public class VMeInfo {
    private Integer menuId;
    private String menuName;
    private String menuUrl;
    // 子菜单列表
    private List<VMeInfo> menuList;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public List<VMeInfo> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<VMeInfo> menuList) {
        this.menuList = menuList;
    }
}
