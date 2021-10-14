package com.example.core.base.presentation.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/core/base/presentation/extension/ActionDebouncer;", "", "action", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "lastActionTime", "", "notifyAction", "Companion", "core_debug"})
final class ActionDebouncer {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.core.base.presentation.extension.ActionDebouncer.Companion Companion = null;
    public static final long DEBOUNCE_INTERVAL_MILLISECONDS = 600L;
    private long lastActionTime = 0L;
    
    public ActionDebouncer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        super();
    }
    
    public final void notifyAction() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/core/base/presentation/extension/ActionDebouncer$Companion;", "", "()V", "DEBOUNCE_INTERVAL_MILLISECONDS", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}