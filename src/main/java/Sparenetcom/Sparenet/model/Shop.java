package Sparenetcom.Sparenet.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Shop {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;


    private String shopName;
    private String ownersName;
    private String status;
    private String email;
    private String phoneNumber;
    private LocalDate registerDate;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin addedByAdmin;

    @OneToMany(mappedBy = "shop")
    private List<Orders> orders;

    @OneToMany(mappedBy = "shop")
    private List<Inventory> inventories;

    @OneToMany(mappedBy = "shop")
    private List<RequestProduct> requestProducts;

    @OneToMany(mappedBy = "receiverShop")
    private List<ShopRequest> receivedShopRequests;

    @OneToMany(mappedBy = "senderShop")
    private List<ShopRequest> sentShopRequests;

    @OneToMany(mappedBy = "shop")
    private List<FriendlyShopList> friendlyShopLists;
}



