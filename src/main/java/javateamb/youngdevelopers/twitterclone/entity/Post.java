package javateamb.youngdevelopers.twitterclone.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Post {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "repost_id")
    private Long repostId;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "reply_counter")
    private Long replyCounter;
    @Basic
    @Column(name = "repost_counter")
    private Long repostCounter;
    @Basic
    @Column(name = "like_counter")
    private Long likeCounter;
    @Basic
    @Column(name = "photo")
    private String photo;
    @Basic
    @Column(name = "post_type_id")
    private Integer postTypeId;
    @OneToMany(mappedBy = "postByPostId")
    private Collection<LikedPosts> likedPostsById;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false , updatable = false)
    private Users usersByUserId;
    @ManyToOne
    @JoinColumn(name = "post_type_id", referencedColumnName = "id", insertable = false , updatable = false)
    private PostType postTypeByPostTypeId;
    @OneToMany(mappedBy = "postByPostId")
    private Collection<ReTweet> reTweetsById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getRepostId() {
        return repostId;
    }

    public void setRepostId(Long repostId) {
        this.repostId = repostId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getReplyCounter() {
        return replyCounter;
    }

    public void setReplyCounter(Long replyCounter) {
        this.replyCounter = replyCounter;
    }

    public Long getRepostCounter() {
        return repostCounter;
    }

    public void setRepostCounter(Long repostCounter) {
        this.repostCounter = repostCounter;
    }

    public Long getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(Long likeCounter) {
        this.likeCounter = likeCounter;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(Integer postTypeId) {
        this.postTypeId = postTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (id != post.id) return false;
        if (userId != null ? !userId.equals(post.userId) : post.userId != null) return false;
        if (createdAt != null ? !createdAt.equals(post.createdAt) : post.createdAt != null) return false;
        if (repostId != null ? !repostId.equals(post.repostId) : post.repostId != null) return false;
        if (text != null ? !text.equals(post.text) : post.text != null) return false;
        if (replyCounter != null ? !replyCounter.equals(post.replyCounter) : post.replyCounter != null) return false;
        if (repostCounter != null ? !repostCounter.equals(post.repostCounter) : post.repostCounter != null)
            return false;
        if (likeCounter != null ? !likeCounter.equals(post.likeCounter) : post.likeCounter != null) return false;
        if (photo != null ? !photo.equals(post.photo) : post.photo != null) return false;
        if (postTypeId != null ? !postTypeId.equals(post.postTypeId) : post.postTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (repostId != null ? repostId.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (replyCounter != null ? replyCounter.hashCode() : 0);
        result = 31 * result + (repostCounter != null ? repostCounter.hashCode() : 0);
        result = 31 * result + (likeCounter != null ? likeCounter.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (postTypeId != null ? postTypeId.hashCode() : 0);
        return result;
    }

    public Collection<LikedPosts> getLikedPostsById() {
        return likedPostsById;
    }

    public void setLikedPostsById(Collection<LikedPosts> likedPostsById) {
        this.likedPostsById = likedPostsById;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    public PostType getPostTypeByPostTypeId() {
        return postTypeByPostTypeId;
    }

    public void setPostTypeByPostTypeId(PostType postTypeByPostTypeId) {
        this.postTypeByPostTypeId = postTypeByPostTypeId;
    }

    public Collection<ReTweet> getReTweetsById() {
        return reTweetsById;
    }

    public void setReTweetsById(Collection<ReTweet> reTweetsById) {
        this.reTweetsById = reTweetsById;
    }
}
