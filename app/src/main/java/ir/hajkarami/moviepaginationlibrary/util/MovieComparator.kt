package ir.hajkarami.moviepaginationlibrary.util

import androidx.recyclerview.widget.DiffUtil
import ir.hajkarami.moviepaginationlibrary.model.Movie

class MovieComparator : DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(
        oldItem: Movie,
        newItem: Movie
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: Movie,
        newItem: Movie
    ): Boolean {
        return oldItem.id == newItem.id
    }
}