package com.example.core.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\r\u0010\u0007\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/core/di/module/BaseModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideHttpClient$core_debug", "provideRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "httpClient", "core_debug"})
@dagger.Module()
public final class BaseModule {
    
    public BaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient$core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
}