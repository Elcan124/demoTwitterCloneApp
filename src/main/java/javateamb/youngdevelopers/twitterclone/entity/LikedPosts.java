package javateamb.youngdevelopers.twitterclone.entity;

import javax.persistence.*;

@Entity
@Table(name = "liked_posts", schema = "twittercloneapp", catalog = "")
public class LikedPosts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "post_id")
    private Long postId;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id" , insertable = false , updatable = false)
    private Post postByPostId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false , updatable = false)
    private Users usersByUserId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikedPosts that = (LikedPosts) o;

        if (id != that.id) return false;
        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    public Post getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(Post postByPostId) {
        this.postByPostId = postByPostId;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}
