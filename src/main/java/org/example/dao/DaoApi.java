package org.example.dao;

// dao/DaoApi.java (220.0, profil api)
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoApi")
@Profile("api")
public class DaoApi implements IDao {
    @Override public double getValue(){ return 220.0; }
}