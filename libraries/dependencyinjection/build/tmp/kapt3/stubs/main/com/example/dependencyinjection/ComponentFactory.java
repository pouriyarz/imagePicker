package com.example.dependencyinjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dependencyinjection/ComponentFactory;", "T", "", "()V", "create", "()Ljava/lang/Object;", "dependencyinjection"})
public abstract class ComponentFactory<T extends java.lang.Object> {
    
    public ComponentFactory() {
        super();
    }
    
    public abstract T create();
}