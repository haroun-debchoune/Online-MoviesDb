package com.example.movieapp.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.library.baseAdapters.BR;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

//api key : 5c17867fc2d1fbf055ef1dd52222bc12
@Generated("jsonschema2pojo")
public class Movie extends BaseObservable implements Parcelable {

        @SerializedName("adult")
        @Expose
        private Boolean adult;

        @SerializedName("backdrop_path")
        @Expose
        private String backdropPath;

        @SerializedName("genre_ids")
        @Expose
        private List<Integer> genreIds;

        @SerializedName("id")
        @Expose
        private Integer id;

        @SerializedName("original_language")
        @Expose
        private String originalLanguage;

        @SerializedName("original_title")
        @Expose
        private String originalTitle;

        @SerializedName("overview")
        @Expose
        private String overview;

        @SerializedName("popularity")
        @Expose
        private Double popularity;

        @SerializedName("poster_path")
        @Expose
        private String posterPath;

        @SerializedName("release_date")
        @Expose
        private String releaseDate;

        @SerializedName("title")
        @Expose
        private String title;

        @SerializedName("video")
        @Expose
        private Boolean video;

        @SerializedName("vote_average")
        @Expose
        private Double voteAverage;

        @SerializedName("vote_count")
        @Expose
        private Integer voteCount;


    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @BindingAdapter("posterPath")
    public static void loadImage(ImageView imageView, String imageURL){
        String imagePath = "https://image.tmdb.org/t/p/w500" + imageURL;
        Glide.with(imageView.getContext()).load(imagePath).into(imageView);
    }

        @Bindable
        public Boolean getAdult() {
            return adult;
        }

        public void setAdult(Boolean adult) {
            this.adult = adult;
            notifyPropertyChanged(BR.adult);
        }

        @Bindable
        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
            notifyPropertyChanged(BR.backdropPath);
        }

        @Bindable
        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
            notifyPropertyChanged(BR.genreIds);
        }

        @Bindable
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
            notifyPropertyChanged(BR.id);
        }

        @Bindable
        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
            notifyPropertyChanged(BR.originalLanguage);
        }

        @Bindable
        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
            notifyPropertyChanged(BR.originalTitle);
        }

        @Bindable
        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
            notifyPropertyChanged(BR.overview);
        }

        @Bindable
        public Double getPopularity() {
            return popularity;
        }

        public void setPopularity(Double popularity) {
            this.popularity = popularity;
            notifyPropertyChanged(BR.popularity);
        }

        @Bindable
        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
            notifyPropertyChanged(BR.posterPath);
        }

        @Bindable
        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            notifyPropertyChanged(BR.releaseDate);
        }

        @Bindable
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
            notifyPropertyChanged(BR.title);
        }

        @Bindable
        public Boolean getVideo() {
            return video;
        }

        public void setVideo(Boolean video) {
            this.video = video;
            notifyPropertyChanged(BR.video);
        }

        @Bindable
        public Double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(Double voteAverage) {
            this.voteAverage = voteAverage;
            notifyPropertyChanged(BR.voteAverage);
        }

        @Bindable
        public Integer getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
            notifyPropertyChanged(BR.voteCount);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeValue(adult);
            parcel.writeString(backdropPath);
            parcel.writeList(genreIds);
            parcel.writeValue(id);
            parcel.writeString(originalLanguage);
            parcel.writeString(originalTitle);
            parcel.writeString(overview);
            parcel.writeValue(popularity);
            parcel.writeString(posterPath);
            parcel.writeString(releaseDate);
            parcel.writeString(title);
            parcel.writeValue(video);
            parcel.writeValue(voteAverage);
            parcel.writeValue(voteCount);

        }

    public Movie( Parcel in) {
        this.adult = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.backdropPath = in.readString();
        this.genreIds = in.readArrayList(Integer.class.getClassLoader());
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.originalLanguage = in.readString();
        this.originalTitle = in.readString();
        this.overview = in.readString();
        this.popularity = (Double) in.readValue(Double.class.getClassLoader());
        this.posterPath = in.readString();
        this.releaseDate = in.readString();
        this.title = in.readString();
        this.video = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.voteAverage = (Double) in.readValue(Double.class.getClassLoader());
        this.voteCount = (Integer) in.readValue(Integer.class.getClassLoader());
    }
}
