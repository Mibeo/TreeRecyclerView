package com.baozi.demo.item.news;

import android.support.annotation.NonNull;

import com.baozi.demo.R;
import com.baozi.demo.bean.NewsItemBean;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.factory.ItemHelperFactory;
import com.baozi.treerecyclerview.item.TreeItem;
import com.baozi.treerecyclerview.item.TreeItemGroup;

import java.util.List;

/**
 * @author jlanglang  2017/7/5 17:15
 * @版本 2.0
 * @Change
 */

public class NewsItem extends TreeItemGroup<NewsItemBean> {
    @Override
    protected List<TreeItem> initChildList(NewsItemBean data) {
        List<TreeItem> treeItemList = ItemHelperFactory.createItems(data.getImageBeanList(), this);
        treeItemList.add(ItemHelperFactory.createTreeItem(data.getFootBean()));
        return treeItemList;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_news_title;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder) {

    }
}
