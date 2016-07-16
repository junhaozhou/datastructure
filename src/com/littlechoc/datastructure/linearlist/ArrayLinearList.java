package com.littlechoc.datastructure.linearlist;

import java.util.InputMismatchException;
import java.util.Objects;

/**
 * @author 周俊皓.
 *         2016-07-16 19:50
 */
public class ArrayLinearList<E> implements LinearList<E> {

  /**
   * 线性表默认容量和扩展容量
   */
  private static final int DEFAULT_CAPACITY = 10;

  /**
   * 线性表当前长度
   */
  private int length;

  /**
   * 线性表元素数组
   */
  private Object[] elements;

  /**
   * 创建一个数组线性表，具有默认的大小
   */
  public ArrayLinearList() {
    elements = new Object[DEFAULT_CAPACITY];
    length = 0;
  }

  @Override
  public void clear() {
    for (int i = 0; i < length; i++) {
      elements[i] = null;
    }
    length = 0;
  }

  @Override
  public boolean isEmpty() {
    return length == 0;
  }

  @Override
  public int length() {
    return length;
  }

  @Override
  public E get(int index) throws IndexOutOfBoundsException {
    checkRange(index);
    return getElement(index);
  }

  @Override
  public E getPrior(int index) throws IndexOutOfBoundsException {
    checkRange(index);
    return index == 0 ? null : getElement(index - 1); // index == 0 时没有前驱
  }

  @Override
  public E getNext(int index) throws IndexOutOfBoundsException {
    checkRange(index);
    return index == length - 1 ? null : getElement(index + 1); // index == length - 1 时没有后继
  }

  @Override
  public void add(int index, E data) throws IndexOutOfBoundsException {
    checkRange(index);
    ensureCapacity(length + 1);

    // index及之后的元素向后移
    for (int i = index; i < length; i++) {
      Object temp = elements[i];
      elements[i] = elements[i + 1];
      elements[i + 1] = temp;
    }

    // 存入元素
    elements[index] = data;

    ++length;
  }

  @Override
  public E remove(int index) throws IndexOutOfBoundsException {
    E removedElement = getElement(index);

    // index之后的元素左移
    for (int i = index + 1; i < length; i++) {
      elements[i - 1] = elements[i];
    }
    --length;

    return removedElement;
  }

  @SuppressWarnings("unchecked")
  private E getElement(int index) {
    return (E) elements[index];
  }

  private void checkRange(int index) {
    if (index < 0 || index >= length) {
      throw new IndexOutOfBoundsException();
    }
  }

  private void ensureCapacity(int capacity) {
    // TODO 确认空间是否充足，不充足则需要扩容
  }
}
