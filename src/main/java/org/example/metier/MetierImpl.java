package org.example.metier;


import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }// pas de @Qualifier ici
    @Override
    public double calcul() { return dao.getValue() * 2; }
    //Petite trace pour le débogage

}