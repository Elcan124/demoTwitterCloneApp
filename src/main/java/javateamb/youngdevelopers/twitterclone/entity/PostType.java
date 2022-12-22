package javateamb.youngdevelopers.twitterclone.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "post_type", schema = "twittercloneapp", catalog = "")
public class PostType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "postTypeByPostTypeId")
    private Collection<Post> postsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostType postType = (PostType) o;

        if (id != postType.id) return false;
        if (type != null ? !type.equals(postType.type) : postType.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public Collection<Post> getPostsById() {
        return postsById;
    }

    public void setPostsById(Collection<Post> postsById) {
        this.postsById = postsById;
    }
}
