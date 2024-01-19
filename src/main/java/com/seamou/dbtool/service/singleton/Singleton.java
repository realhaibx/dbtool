package com.seamou.dbtool.service.singleton;

public class Singleton {
    public static class SingletonHolder{
        public static final Singleton SINGLETON_INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.SINGLETON_INSTANCE;
    }
}
