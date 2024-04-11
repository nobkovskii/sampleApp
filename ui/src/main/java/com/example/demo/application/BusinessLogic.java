package com.example.demo.application;

/**
 * 業務ロジックの実装メソッドのシグネチャを制限するインターフェース
 */
public interface BusinessLogic<I,O> {
    O execute(I input);
}
