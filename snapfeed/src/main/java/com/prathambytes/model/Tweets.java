package com.prathambytes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tweets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    private String content;
    private String image;
    private String video;

    @OneToMany(mappedBy = "tweets", cascade = CascadeType.ALL)
    private List<Like> likes = new ArrayList<>();

    @OneToMany
    private List<Tweets> replyTweets = new ArrayList<>();

    @ManyToMany
    private List<User> reTweetUser = new ArrayList<>();

    @ManyToOne
    private Tweets replyFor;

    private boolean isReply;
    private boolean isTweet;

















}
