package com.littlechoc.datastructure.search;

import com.littlechoc.datastructure.search.IBinarySortTree;
import com.littlechoc.datastructure.tree.BinaryTreeNode;

/**
 * 二叉排序树
 *
 * @author 周俊皓.
 *         2016-08-06 17:46
 */
public class BinarySortTree implements IBinarySortTree<Integer> {

  private BinaryTreeNode root;

  public BinarySortTree() {

  }

  @Override
  public BinaryTreeNode search(Integer key) {
    return null;
  }

  @Override
  public boolean delete(int value) {
    return false;
  }
}
