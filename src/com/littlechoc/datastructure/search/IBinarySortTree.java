package com.littlechoc.datastructure.search;

import com.littlechoc.datastructure.search.ISearchTable;
import com.littlechoc.datastructure.tree.BinaryTreeNode;

/**
 * @author 周俊皓.
 *         2016-08-06 17:47
 */
public interface IBinarySortTree<K> extends ISearchTable<K, BinaryTreeNode> {

  /**
   * 根据键值在二叉排序树中查找一个节点，若没有则加入
   *
   * @param key 键值
   * @return 查找到的节点
   */
  BinaryTreeNode search(K key);

  /**
   * 根据键值删除二叉排序树中的一个节点，若没有则删除
   *
   * @param value
   * @return
   */
  boolean delete(int value);
}
