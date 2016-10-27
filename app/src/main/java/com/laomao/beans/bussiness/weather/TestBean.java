package com.laomao.beans.bussiness.weather;

import java.util.List;

/**
 * Created by laomao on 16/10/26.
 */

public class TestBean {


    /**
     * age : 18
     * name : 老猫
     * createdAt : 2016-10-26T06:12:01.938Z
     * updatedAt : 2016-10-26T06:12:06.347Z
     * objectId : 5810493167f3560057cee9b3
     */

    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private int age;
        private String name;
        private String createdAt;
        private String updatedAt;
        private String objectId;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
