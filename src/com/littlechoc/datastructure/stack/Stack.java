package com.littlechoc.datastructure.stack;


import com.littlechoc.datastructure.linearlist.ArrayList;
import com.littlechoc.datastructure.linearlist.LinearList;

/**
 * 栈
 *
 * @param <E> 数据元素
 * @author 周俊皓.
 *         2016-08-06 19:24
 */
public class Stack<E> implements IStack<E> {

  private LinearList<E> mStack;

  public Stack() {
    mStack = new ArrayList<>();
  }

  @Override
  public void push(E element) {

  }

  @Override
  public E pop() {
    return null;
  }

  @Override
  public E peek() {
    return null;
  }
}
