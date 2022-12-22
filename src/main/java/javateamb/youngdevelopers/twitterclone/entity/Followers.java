package javateamb.youngdevelopers.twitterclone.entity;

import javax.persistence.*;

@Entity
public class Followers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "following_id")
    private long followingId;
    @Basic
    @Column(name = "followerID")
    private long followerId;
    @ManyToOne
    @JoinColumn(name = "following_id", referencedColumnName = "id", nullable = false , insertable = false , updatable = false)
    private Users usersByFollowingId;
    @ManyToOne
    @JoinColumn(name = "followerID", referencedColumnName = "id", nullable = false, insertable = false , updatable = false)
    private Users usersByFollowerId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFollowingId() {
        return followingId;
    }

    public void setFollowingId(long followingId) {
        this.followingId = followingId;
    }

    public long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(long followerId) {
        this.followerId = followerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Followers followers = (Followers) o;

        if (id != followers.id) return false;
        if (followingId != followers.followingId) return false;
        if (followerId != followers.followerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (followingId ^ (followingId >>> 32));
        result = 31 * result + (int) (followerId ^ (followerId >>> 32));
        return result;
    }

    public Users getUsersByFollowingId() {
        return usersByFollowingId;
    }

    public void setUsersByFollowingId(Users usersByFollowingId) {
        this.usersByFollowingId = usersByFollowingId;
    }

    public Users getUsersByFollowerId() {
        return usersByFollowerId;
    }

    public void setUsersByFollowerId(Users usersByFollowerId) {
        this.usersByFollowerId = usersByFollowerId;
    }
}
