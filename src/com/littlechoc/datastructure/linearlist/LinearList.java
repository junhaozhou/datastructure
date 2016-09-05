package com.littlechoc.datastructure.linearlist;

/**
 * 线性表操作定义
 *
 * @author 周俊皓.
 *         2016-07-16 19:23
 */
public interface LinearList<E> {

  /**
   * 清空线性表
   */
  void clear();

  /**
   * 线性表是否为空
   *
   * @return true 线性表为空
   * false 线性表不为空
   */
  boolean isEmpty();

  /**
   * 获取线性表的长度
   *
   * @return 线性表长度
   */
  int length();

  /**
   * 获取线性表特定位置的数据元素
   *
   * @param index 特定位置
   * @return 数据元素
   * @throws IndexOutOfBoundsException 当index < 0 || index >= list.length时，抛出异常
   */
  E get(int index) throws IndexOutOfBoundsException;

  /**
   * 获取线性表特定位置数据元素的前驱
   *
   * @param index 特定位置
   * @return 数据元素，若无则返回null
   * @throws IndexOutOfBoundsException 当index < 0 || index >= list.length时，抛出异常
   */
  E getPrior(int index) throws IndexOutOfBoundsException;

  /**
   * 获取线性表特定位置数据元素的后驱
   *
   * @param index 特定位置
   * @return 数据元素，若无则返回null
   * @throws IndexOutOfBoundsException 当index < 0 || index >= list.length时，抛出异常
   */
  E getNext(int index) throws IndexOutOfBoundsException;

  /**
   * 在指定位置后插入一个新元素
   *
   * @param index 位置
   * @param data  待插入数据元素
   * @throws IndexOutOfBoundsException 当index < 0 || index >= list.length时，抛出异常
   */
  void add(int index, E data) throws IndexOutOfBoundsException;

  /**
   * 移除指定位置的元素
   *
   * @param index 指定位置
   * @return 被删除的数据元素
   * @throws IndexOutOfBoundsException 当index < 0 || index >=list.length时，抛出异常
   */
  E remove(int index) throws IndexOutOfBoundsException;

}
