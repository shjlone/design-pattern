package com.shjlone.singleton;

/**
 * 静态内部类实现
 */
public class SICSingleton {

    private static class SingletonHolder {
        private static final SICSingleton INSTANCE = new SICSingleton();
    }
    private SICSingleton (){}
    public static final SICSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
}
