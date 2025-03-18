package ir.hajkarami.moviepaginationlibrary.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.rxjava3.PagingRx
import ir.hajkarami.moviepaginationlibrary.model.Movie
import io.reactivex.rxjava3.core.Flowable

class MovieViewModel : ViewModel() {

    val moviePagingDataFlowable: Flowable<PagingData<Movie>>

    init {
        val moviePagingSource = MoviePagingSource()

        val pager = Pager(
            config = PagingConfig(
                pageSize = 20,
                prefetchDistance = 20,
                enablePlaceholders = false,
                initialLoadSize = 20,
                maxSize = 20 * 499
            ),
            pagingSourceFactory = { moviePagingSource }
        )

        moviePagingDataFlowable = PagingRx.getFlowable(pager)

        PagingRx.cachedIn(moviePagingDataFlowable, viewModelScope)
    }
}
