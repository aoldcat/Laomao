package com.laomao.beans.bussiness.blog;

import com.laomao.beans.BaseBean;

import java.util.List;

/**
 * Created by laomao on 16/10/27.
 */

public class BlogBean extends BaseBean{

    /**
     * content : 测试内容
     * title : 测试标题
     * createdAt : 2016-10-26T09:44:05.109Z
     * updatedAt : 2016-10-26T09:44:05.109Z
     * objectId : 58107ae5c4c9710058a90b8d
     */

    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String content;
        private String title;
        private String createdAt;
        private String updatedAt;
        private String objectId;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }
    }
}
