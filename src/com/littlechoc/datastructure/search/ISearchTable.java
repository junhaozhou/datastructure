package com.littlechoc.datastructure.search;

/**
 * 查找表接口
 *
 * @param <K> 数据键值
 * @param <R> 查找结果
 * @author 周俊皓.
 *         2016-08-06 17:51
 */
public interface ISearchTable<K, R> {

  /**
   * 根据键值在查找表中查找数据元素
   *
   * @param key 键值
   * @return 查找结果
   */
  R search(K key);

}
