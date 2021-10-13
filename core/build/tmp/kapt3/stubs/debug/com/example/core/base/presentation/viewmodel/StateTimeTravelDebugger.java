package com.example.core.base.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0002J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/core/base/presentation/viewmodel/StateTimeTravelDebugger;", "", "viewClassName", "", "(Ljava/lang/String;)V", "lastViewAction", "Lcom/example/core/base/presentation/viewmodel/BaseAction;", "propertyNames", "", "getPropertyNames", "()Ljava/util/List;", "propertyNames$delegate", "Lkotlin/Lazy;", "stateTimeline", "", "Lcom/example/core/base/presentation/viewmodel/StateTimeTravelDebugger$StateTransition;", "addAction", "", "viewAction", "addStateTransition", "oldState", "Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "newState", "getLogLine", "propertyName", "getMessage", "getPropertyValue", "baseViewState", "logAll", "logLast", "StateTransition", "core_debug"})
public final class StateTimeTravelDebugger {
    private final java.lang.String viewClassName = null;
    private final java.util.List<com.example.core.base.presentation.viewmodel.StateTimeTravelDebugger.StateTransition> stateTimeline = null;
    private com.example.core.base.presentation.viewmodel.BaseAction lastViewAction;
    private final kotlin.Lazy propertyNames$delegate = null;
    
    public StateTimeTravelDebugger(@org.jetbrains.annotations.NotNull()
    java.lang.String viewClassName) {
        super();
    }
    
    public final void addAction(@org.jetbrains.annotations.NotNull()
    com.example.core.base.presentation.viewmodel.BaseAction viewAction) {
    }
    
    public final void addStateTransition(@org.jetbrains.annotations.NotNull()
    com.example.core.base.presentation.viewmodel.BaseViewState oldState, @org.jetbrains.annotations.NotNull()
    com.example.core.base.presentation.viewmodel.BaseViewState newState) {
    }
    
    private final java.lang.String getMessage() {
        return null;
    }
    
    private final java.lang.String getMessage(java.util.List<com.example.core.base.presentation.viewmodel.StateTimeTravelDebugger.StateTransition> stateTimeline) {
        return null;
    }
    
    public final void logAll() {
    }
    
    public final void logLast() {
    }
    
    private final java.lang.String getLogLine(com.example.core.base.presentation.viewmodel.BaseViewState oldState, com.example.core.base.presentation.viewmodel.BaseViewState newState, java.lang.String propertyName) {
        return null;
    }
    
    private final java.util.List<java.lang.String> getPropertyNames() {
        return null;
    }
    
    private final java.lang.String getPropertyValue(com.example.core.base.presentation.viewmodel.BaseViewState baseViewState, java.lang.String propertyName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/core/base/presentation/viewmodel/StateTimeTravelDebugger$StateTransition;", "", "oldState", "Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "action", "Lcom/example/core/base/presentation/viewmodel/BaseAction;", "newState", "(Lcom/example/core/base/presentation/viewmodel/BaseViewState;Lcom/example/core/base/presentation/viewmodel/BaseAction;Lcom/example/core/base/presentation/viewmodel/BaseViewState;)V", "getAction", "()Lcom/example/core/base/presentation/viewmodel/BaseAction;", "getNewState", "()Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "getOldState", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_debug"})
    static final class StateTransition {
        @org.jetbrains.annotations.NotNull()
        private final com.example.core.base.presentation.viewmodel.BaseViewState oldState = null;
        @org.jetbrains.annotations.NotNull()
        private final com.example.core.base.presentation.viewmodel.BaseAction action = null;
        @org.jetbrains.annotations.NotNull()
        private final com.example.core.base.presentation.viewmodel.BaseViewState newState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.StateTimeTravelDebugger.StateTransition copy(@org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseViewState oldState, @org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseAction action, @org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseViewState newState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StateTransition(@org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseViewState oldState, @org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseAction action, @org.jetbrains.annotations.NotNull()
        com.example.core.base.presentation.viewmodel.BaseViewState newState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseViewState getOldState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseAction component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseAction getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseViewState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.core.base.presentation.viewmodel.BaseViewState getNewState() {
            return null;
        }
    }
}