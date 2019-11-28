package com.roger.mvpdemo.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class FanyiBean {

    public List<String> getTranslation() {
        return translation;
    }

    public void setTranslation(List<String> translation) {
        this.translation = translation;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<Web> getWeb() {
        return web;
    }

    public void setWeb(List<Web> web) {
        this.web = web;
    }

    private List<String> translation;
    private Basic basic;
    private String query;
    private int errorCode;
    private List<Web> web;



    /**
     * Auto-generated: 2019-11-28 10:36:18
     *
     * @author bejson.com (i@bejson.com)
     * @website http://www.bejson.com/java2pojo/
     */
    public class Basic {

        @JSONField(name = "us-phonetic")
        private String usphonetic;

        private String phonetic;
        @JSONField(name = "uk-phonetic")
        private String ukphonetic;

        private List<String> explains;
        public void setUsphonetic(String phonetic) {
            this.usphonetic = phonetic;
        }
        public String getUsphonetic() {
            return usphonetic;
        }

        public void setPhonetic(String phonetic) {
            this.phonetic = phonetic;
        }
        public String getPhonetic() {
            return phonetic;
        }

        public void setUkphonetic(String phonetic) {
            this.phonetic = phonetic;
        }
        public String getphonetic() {
            return phonetic;
        }

        public void setExplains(List<String> explains) {
            this.explains = explains;
        }
        public List<String> getExplains() {
            return explains;
        }

    }



    public class Web {

        private List<String> value;
        private String key;
        public void setValue(List<String> value) {
            this.value = value;
        }
        public List<String> getValue() {
            return value;
        }

        public void setKey(String key) {
            this.key = key;
        }
        public String getKey() {
            return key;
        }

    }




//    List translation;
//    String query;
//    int errorCode;
//
//    BasicBean basic;
//
//    List<HashMap<String, List<String>>> web;
//
//    public BasicBean getBasic() {
//        return basic;
//    }
//
//    public void setBasic(BasicBean basic) {
//        this.basic = basic;
//    }
//
//
//
//    public List<HashMap<String, List<String>>> getWeb() {
//        return web;
//    }
//
//    public void setWeb(List<HashMap<String, List<String>>> web) {
//        this.web = web;
//    }
//
//
//
//    public List getTranslation() {
//        return translation;
//    }
//
//    public void setTranslation(List translation) {
//        this.translation = translation;
//    }
//
//    public String getQuery() {
//        return query;
//    }
//
//    public void setQuery(String query) {
//        this.query = query;
//    }
//
//    public int getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(int errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public class BasicBean {
//        public String getPhonetic() {
//            return phonetic;
//        }
//
//        public void setPhonetic(String phonetic) {
//            this.phonetic = phonetic;
//        }
//
//        public List getExplains() {
//            return explains;
//        }
//
//        public void setExplains(List explains) {
//            this.explains = explains;
//        }
//
//        private String phonetic;
//        private List explains;
//    }
}
