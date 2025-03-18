package ir.hajkarami.moviepaginationlibrary.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    @Expose
    private val page: Int,

    @SerializedName("result")
    @Expose
    private val movie: List<Movie>,

    @SerializedName("total_page")
    @Expose
    private val totalPage: Int,

    @SerializedName("total_results")
    @Expose
    private val totalResults: Int

)

