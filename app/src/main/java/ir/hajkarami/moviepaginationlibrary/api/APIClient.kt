package ir.hajkarami.moviepaginationlibrary.api

import io.reactivex.rxjava3.core.Single
import ir.hajkarami.moviepaginationlibrary.model.MovieResponse
import ir.hajkarami.moviepaginationlibrary.util.Utils.Companion.API_KEY
import ir.hajkarami.moviepaginationlibrary.util.Utils.Companion.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object APIClient {
    private val client: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor(Interceptor { chain ->
                val original = chain.request()
                val originalHttpUrl = original.url()

                val url = originalHttpUrl.newBuilder()
                    .addQueryParameter("api_key", API_KEY)
                    .build()
                val request = original.newBuilder().url(url).build()
                chain.proceed(request)
            })
            .build()
    }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
    val apiService: APIInterface by lazy {
        retrofit.create(APIInterface::class.java)
    }

    interface APIInterface {
        @GET("movie/popular")
        fun getMoviesByPage(@Query("page") page: Int): Single<MovieResponse>
    }
}