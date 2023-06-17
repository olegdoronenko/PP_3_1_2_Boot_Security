package ru.kata.spring.boot_security.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "players_party")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nickName;
    private String playerClass;
    private int playerLevel;

    public User() {

    }

    public User(String nickName, String playerClass, int playerLevel) {
        this.nickName = nickName;
        this.playerClass = playerClass;
        this.playerLevel = playerLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && playerLevel == user.playerLevel && Objects.equals(nickName, user.nickName) && Objects.equals(playerClass, user.playerClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickName, playerClass, playerLevel);
    }
}
