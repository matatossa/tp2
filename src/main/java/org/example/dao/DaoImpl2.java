package org.example.dao;
// dao/DaoImpl2.java (150.0, profil dev)
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile("dev")
public class DaoImpl2 implements IDao {
    @Override public double getValue(){ return 150.0; }
}
