package com.littlechoc.datastructure.sort;

import java.util.Collections;

/**
 * 比较器
 *
 * @param <E> 比较的数据元素
 * @author 周俊皓.
 *         2016-08-06 23:08
 */
public interface IComparator<E> {

  /**
   * 比较两个数据元素的大小
   *
   * @param e1 元素1
   * @param e2 元素2
   * @return e1 > e2 返回正数，e1 == e2 返回0，e1 < e2 返回负数
   */
  int compare(E e1, E e2);
}
