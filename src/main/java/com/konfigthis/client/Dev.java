package com.konfigthis.client;

import com.konfigthis.client.api.ArticlesApi;
import com.konfigthis.client.api.BillboardsApi;
import com.konfigthis.client.api.CommentsApi;
import com.konfigthis.client.api.FollowedTagsApi;
import com.konfigthis.client.api.FollowersApi;
import com.konfigthis.client.api.OrganizationsApi;
import com.konfigthis.client.api.PagesApi;
import com.konfigthis.client.api.PodcastEpisodesApi;
import com.konfigthis.client.api.ProfileImagesApi;
import com.konfigthis.client.api.ReactionsApi;
import com.konfigthis.client.api.ReadinglistApi;
import com.konfigthis.client.api.SegmentsApi;
import com.konfigthis.client.api.TagsApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.VideosApi;

public class Dev {
    private ApiClient apiClient;
    public final ArticlesApi articles;
    public final BillboardsApi billboards;
    public final CommentsApi comments;
    public final FollowedTagsApi followedTags;
    public final FollowersApi followers;
    public final OrganizationsApi organizations;
    public final PagesApi pages;
    public final PodcastEpisodesApi podcastEpisodes;
    public final ProfileImagesApi profileImages;
    public final ReactionsApi reactions;
    public final ReadinglistApi readinglist;
    public final SegmentsApi segments;
    public final TagsApi tags;
    public final UsersApi users;
    public final VideosApi videos;

    public Dev() {
        this(null);
    }

    public Dev(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.articles = new ArticlesApi(this.apiClient);
        this.billboards = new BillboardsApi(this.apiClient);
        this.comments = new CommentsApi(this.apiClient);
        this.followedTags = new FollowedTagsApi(this.apiClient);
        this.followers = new FollowersApi(this.apiClient);
        this.organizations = new OrganizationsApi(this.apiClient);
        this.pages = new PagesApi(this.apiClient);
        this.podcastEpisodes = new PodcastEpisodesApi(this.apiClient);
        this.profileImages = new ProfileImagesApi(this.apiClient);
        this.reactions = new ReactionsApi(this.apiClient);
        this.readinglist = new ReadinglistApi(this.apiClient);
        this.segments = new SegmentsApi(this.apiClient);
        this.tags = new TagsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
    }

}
