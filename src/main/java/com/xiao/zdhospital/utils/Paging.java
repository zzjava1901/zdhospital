package com.xiao.zdhospital.utils;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Paging {
	
	
	public static <T> Map<String, Object> paging(List<T> list){
		
		Map<String, Object> map = new HashMap<>();
		map.put("total", ((Page)list).getTotal());
		map.put("rows", list);
		
		return map;
	}

}
