/********************************************************************************************
 * Copyright (C) 2016 Acoustic, L.P. All rights reserved.
 *
 * NOTICE: This file contains material that is confidential and proprietary to
 * Acoustic, L.P. and/or other developers. No license is granted under any intellectual or
 * industrial property rights of Acoustic, L.P. except as may be provided in an agreement with
 * Acoustic, L.P. Any unauthorized copying or distribution of content from this file is
 * prohibited.
 ********************************************************************************************/
package com.tl.uic.app.model;

import java.util.ArrayList;

import com.tl.uic.appDarkHolo.R;

public class Items {
    private static final Items INST = new Items();

    private Items() {
    };

    public static Items getInstance() {
        return INST;
    }

    public static final int ROOT_CATEGORY_ID = -1;

    private Category[] categories = {
			new Category("Apparel", R.drawable.highheel3, 0, ROOT_CATEGORY_ID),
			new Category("Electronics", R.drawable.laptop4, 1, ROOT_CATEGORY_ID),
			new Category("Furniture", R.drawable.furniture_1_sm, 2, ROOT_CATEGORY_ID), };

  
    public ArrayList<Category> getCategories() {
        ArrayList<Category> results = new ArrayList<Category>();
        for (Category cat : categories) {
            results.add(cat);
        }
        return results;
    }

    public Category getCategory(int id) {
        for (Category cat : categories) {
            if (cat.getId() == id) {
                return cat;
            }
        }
        return null;
    }

    public class Category extends Item {
        private int parentId;

        public Category(String name, int thumbnail, int id, int parentId) {
            this.name = name;
            this.thumbnail = thumbnail;
            this.id = id;
            this.setParentId(parentId);
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

    }

    public class Product extends Item {
        private String url;
        private int categoryId;
        private double price;
        private int picture;
        private boolean failtoadd;

        public boolean getFailToAdd() {
            return failtoadd;
        }

        public int getPicture() {
            return picture;
        }

        public void setPicture(int picture) {
            this.picture = picture;
        }

        public Product(String name, int thumbnail, int picture, String url,
                double price, int id, int categoryId) {
            this.categoryId = categoryId;
            this.id = id;
            this.name = name;
            this.url = url;
            this.thumbnail = thumbnail;
            this.price = price;
            this.picture = picture;
            this.failtoadd = false;
        }

        public Product(String name, int thumbnail, int picture, String url,
                double price, int id, int categoryId, boolean failtoadd) {
            this.categoryId = categoryId;
            this.id = id;
            this.name = name;
            this.url = url;
            this.thumbnail = thumbnail;
            this.price = price;
            this.picture = picture;
            this.failtoadd = failtoadd;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

    }

    public class Item {
        protected String name;
        protected int thumbnail;
        protected int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(int thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
