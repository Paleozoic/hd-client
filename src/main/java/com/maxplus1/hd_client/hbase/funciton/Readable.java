package com.maxplus1.hd_client.hbase.funciton;

import com.maxplus1.hd_client.hbase.operations.PageInfo;
import org.apache.hadoop.hbase.filter.Filter;

import java.util.List;

/**
 * 读操作接口
 * Created by qxloo on 2017/5/28.
 */
public interface Readable {
    <T> T find(String rowKey, Class<T> type) ;

    <T> List<T> findList(List<String> rowKeyList, Class<T> type) ;

    <T> List<T> findList(String startRow, String endRow, Class<T> type) ;

    <T> List<T> findList(String preRowkey, Class<T> type) ;

    <T> PageInfo<T> findListByPage(PageInfo<T> pageInfo, Filter... filters) ;
}
