package io.tis.artisMundi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "LANCE")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Long winnerBid;
    private Long highestBid;
    private boolean isDelivered;
    private boolean isPaid;
    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getWinnerBid() {
        return winnerBid;
    }

    public void setWinnerBid(Long winnerBid) {
        this.winnerBid = winnerBid;
    }

    public Long getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(Long highestBid) {
        this.highestBid = highestBid;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
