package com.example.core.di.module

import android.app.Application
import android.content.Context
import com.example.core.BuildConfig
import com.example.core.base.data.APIConst
import com.example.core.base.data.network.AuthenticationInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

@Module
class BaseModule {
    @Provides
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    internal fun provideHttpClient(): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.connectTimeout(APIConst.TIME_OUT, TimeUnit.SECONDS)
        httpClient.readTimeout(APIConst.TIME_OUT, TimeUnit.SECONDS)
        httpClient.writeTimeout(APIConst.TIME_OUT, TimeUnit.SECONDS)
        httpClient.retryOnConnectionFailure(true)

        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        httpClient.addInterceptor(logging)
            .addInterceptor(AuthenticationInterceptor(BuildConfig.GRADLE_API_TOKEN))
        return httpClient.build()
    }

    @Provides
    fun provideRetrofitBuilder(httpClient: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.GRADLE_API_BASE_URL)
            .client(httpClient)
            .addConverterFactory(MoshiConverterFactory.create())
    }


}
