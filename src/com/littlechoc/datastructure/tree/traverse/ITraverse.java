package com.littlechoc.datastructure.tree.traverse;


import com.littlechoc.datastructure.tree.TreeNode;

import java.util.List;

/**
 * 遍历树
 *
 * @param <T> 树的结构
 * @author 周俊皓.
 *         2016-08-06 18:41
 */
public interface ITraverse<T extends TreeNode> {

  /**
   * 遍历一棵树，根据遍历顺序将树的节点存在列表中
   *
   * @param root 树的根节点
   * @return 节点列表
   */
  List<T> traverse(T root);
}
