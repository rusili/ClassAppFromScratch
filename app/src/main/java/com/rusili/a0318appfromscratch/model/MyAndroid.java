package com.rusili.a0318appfromscratch.model;

public class MyAndroid {

    //this is an inside model.

    private String name;
    private String ver;
    private String api;

    public MyAndroid(String name, String ver, String api){
        this.name = name;
        this.ver = ver;
        this.api = api;
    }

    public String getName() {
        return name;
    }

    public String getVer() {
        return ver;
    }

    public String getApi() {
        return api;
    }
}
