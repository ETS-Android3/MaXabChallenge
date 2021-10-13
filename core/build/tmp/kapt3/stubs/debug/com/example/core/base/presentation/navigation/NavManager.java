package com.example.core.base.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005J)\u0010\u000b\u001a\u00020\t2!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004R+\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/core/base/presentation/navigation/NavManager;", "", "()V", "navEventListener", "Lkotlin/Function1;", "Landroidx/navigation/NavDirections;", "Lkotlin/ParameterName;", "name", "navDirections", "", "navigate", "setOnNavEvent", "core_debug"})
public final class NavManager {
    private kotlin.jvm.functions.Function1<? super androidx.navigation.NavDirections, kotlin.Unit> navEventListener;
    
    @javax.inject.Inject()
    public NavManager() {
        super();
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections navDirections) {
    }
    
    public final void setOnNavEvent(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.navigation.NavDirections, kotlin.Unit> navEventListener) {
    }
}