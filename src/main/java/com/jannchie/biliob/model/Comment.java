package com.jannchie.biliob.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author jannchie
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document
public class Comment {
    private boolean liked;
    @Id
    private String commentId;
    private ObjectId userId;
    private ObjectId replyComment;
    private Date date;
    @NotBlank(message = "路径不能为空")
    private String path;
    @NotBlank(message = "评论内容不能为空")
    @Length(max = 100, message = "评论最长为100个字符")
    private String content;

    private ArrayList<Comment> replyList;

    private ArrayList<ObjectId> likeList;
    private ArrayList<ObjectId> disLikeList;
    private User user;
    private Integer like;

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public ArrayList<ObjectId> getLikeList() {
        return likeList;
    }

    public void setLikeList(ArrayList<ObjectId> likeList) {
        this.likeList = likeList;
    }

    public ArrayList<ObjectId> getDisLikeList() {
        return disLikeList;
    }

    public void setDisLikeList(ArrayList<ObjectId> disLikeList) {
        this.disLikeList = disLikeList;
    }


    public Integer getDislike() {
        return disLikeList.size();
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public ArrayList<Comment> getReplyList() {
        return replyList;
    }

    public void setReplyList(ArrayList<Comment> replyList) {
        this.replyList = replyList;
    }

    public ObjectId getReplyComment() {
        return replyComment;
    }

    public void setReplyComment(ObjectId replyComment) {
        this.replyComment = replyComment;
    }
}
