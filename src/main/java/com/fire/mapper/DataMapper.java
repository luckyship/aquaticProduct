package com.fire.mapper;

import com.fire.po.ShuichanData;

import java.util.List;
import java.util.Map;

/**
 * Created by ShuFire
 * on 2017/4/6.
 * e-mail：102338496@qq.com
 * 内容说明：
 */


public interface DataMapper {
    public List<ShuichanData> queryHistoryDataByPage(Map<String, Object> parameter) throws Exception;
}