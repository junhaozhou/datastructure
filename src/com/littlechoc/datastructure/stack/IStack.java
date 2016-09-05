package com.littlechoc.datastructure.stack;

/**
 * 栈通用接口
 *
 * @param <E> 数据元素类型
 * @author 周俊皓.
 *         2016-08-06 19:17
 */
public interface IStack<E> {

  /**
   * 入栈
   *
   * @param element 待入栈的元素
   */
  void push(E element);

  /**
   * 出栈
   *
   * @return 出栈的元素
   */
  E pop();

  /**
   * 获取栈顶元素
   *
   * @return
   */
  E peek();
}
