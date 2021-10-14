package com.example.core.base.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u0015\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H$\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0013\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u001fR+\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00008D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/core/base/presentation/viewmodel/BaseViewModel;", "ViewState", "Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "ViewAction", "Lcom/example/core/base/presentation/viewmodel/BaseAction;", "Landroidx/lifecycle/ViewModel;", "initialState", "(Lcom/example/core/base/presentation/viewmodel/BaseViewState;)V", "<set-?>", "state", "getState", "()Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "setState", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "stateLiveData", "Landroidx/lifecycle/LiveData;", "getStateLiveData", "()Landroidx/lifecycle/LiveData;", "stateMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "stateTimeTravelDebugger", "Lcom/example/core/base/presentation/viewmodel/StateTimeTravelDebugger;", "loadData", "", "onLoadData", "onReduceState", "viewAction", "(Lcom/example/core/base/presentation/viewmodel/BaseAction;)Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "postLasState", "sendAction", "(Lcom/example/core/base/presentation/viewmodel/BaseAction;)V", "core_debug"})
public abstract class BaseViewModel<ViewState extends com.example.core.base.presentation.viewmodel.BaseViewState, ViewAction extends com.example.core.base.presentation.viewmodel.BaseAction> extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<ViewState> stateMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ViewState> stateLiveData = null;
    private com.example.core.base.presentation.viewmodel.StateTimeTravelDebugger stateTimeTravelDebugger;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty state$delegate = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    ViewState initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ViewState> getStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final ViewState getState() {
        return null;
    }
    
    protected final void setState(@org.jetbrains.annotations.NotNull()
    ViewState p0) {
    }
    
    public final void sendAction(@org.jetbrains.annotations.NotNull()
    ViewAction viewAction) {
    }
    
    public final void loadData() {
    }
    
    public final void postLasState() {
    }
    
    protected void onLoadData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract ViewState onReduceState(@org.jetbrains.annotations.NotNull()
    ViewAction viewAction);
}