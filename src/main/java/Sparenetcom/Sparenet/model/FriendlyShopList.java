package Sparenetcom.Sparenet.model;

import jakarta.persistence.*;

@Entity
public class FriendlyShopList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FriendShopListId;


    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;



}
