package com.example.springboot_shop.utils;

import com.example.springboot_shop.entity.SpPermission;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {


    //将list集合转成树形结构的list集合
    public static List<SpPermission> permissionListToTree(List<SpPermission> list) {
        //用递归找子。
        List<SpPermission> treeList = new ArrayList<SpPermission>();
        for (SpPermission tree : list) {
            if (tree.getPsPid() == 0) {
                treeList.add(permissionFindChildren(tree, list));
            }
        }
        return treeList;
    }

    //寻找子节点
    private static SpPermission permissionFindChildren(SpPermission tree, List<SpPermission> list) {
        for (SpPermission node : list) {
            if (node.getPsPid().equals(tree.getPsId())) {
                if (tree.getChildren() == null) {
                    tree.setChildren(new ArrayList<SpPermission>());
                }
                tree.getChildren().add(permissionFindChildren(node, list));
            }
        }
        return tree;
    }

}
