package javateamb.youngdevelopers.twitterclone.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id" , unique = true)
    private long id;
    @Basic
    @Column(name = "bio")
    private String bio;
    @Basic
    @Column(name = "birth_date")
    private Date birthDate;
    @Basic
    @Column(name = "email", unique = true)
    private String email;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;
    @Basic
    @Column(name = "username", unique = true)
    private String username;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "user_banner")
    private String userBanner;
    @Basic
    @Column(name = "user_pp")
    private String userPp;
    @OneToMany(mappedBy = "usersByFollowingId")
    private Collection<Followers> followersById;
    @OneToMany(mappedBy = "usersByFollowerId")
    private Collection<Followers> followersById_0;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<LikedPosts> likedPostsById;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<Post> postsById;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<ReTweet> reTweetsById;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<UserRole> userRolesById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserBanner() {
        return userBanner;
    }

    public void setUserBanner(String userBanner) {
        this.userBanner = userBanner;
    }

    public String getUserPp() {
        return userPp;
    }

    public void setUserPp(String userPp) {
        this.userPp = userPp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (bio != null ? !bio.equals(users.bio) : users.bio != null) return false;
        if (birthDate != null ? !birthDate.equals(users.birthDate) : users.birthDate != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null) return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(users.phoneNumber) : users.phoneNumber != null) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (location != null ? !location.equals(users.location) : users.location != null) return false;
        if (userBanner != null ? !userBanner.equals(users.userBanner) : users.userBanner != null) return false;
        if (userPp != null ? !userPp.equals(users.userPp) : users.userPp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (bio != null ? bio.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (userBanner != null ? userBanner.hashCode() : 0);
        result = 31 * result + (userPp != null ? userPp.hashCode() : 0);
        return result;
    }

    public Collection<Followers> getFollowersById() {
        return followersById;
    }

    public void setFollowersById(Collection<Followers> followersById) {
        this.followersById = followersById;
    }

    public Collection<Followers> getFollowersById_0() {
        return followersById_0;
    }

    public void setFollowersById_0(Collection<Followers> followersById_0) {
        this.followersById_0 = followersById_0;
    }

    public Collection<LikedPosts> getLikedPostsById() {
        return likedPostsById;
    }

    public void setLikedPostsById(Collection<LikedPosts> likedPostsById) {
        this.likedPostsById = likedPostsById;
    }

    public Collection<Post> getPostsById() {
        return postsById;
    }

    public void setPostsById(Collection<Post> postsById) {
        this.postsById = postsById;
    }

    public Collection<ReTweet> getReTweetsById() {
        return reTweetsById;
    }

    public void setReTweetsById(Collection<ReTweet> reTweetsById) {
        this.reTweetsById = reTweetsById;
    }

    public Collection<UserRole> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRole> userRolesById) {
        this.userRolesById = userRolesById;
    }
}
