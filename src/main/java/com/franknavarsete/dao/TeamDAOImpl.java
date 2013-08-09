package com.franknavarsete.dao;

import com.franknavarsete.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Frank
 * Date: 08.08.13
 * Time: 18:59
 */
@Repository
public class TeamDAOImpl implements TeamDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addTeam(Team team) {
        getCurrentSession().save(team);
    }

    @Override
    public void updateTeam(Team team) {
        Team teamToUpdate = getTeam(team.getId());

        teamToUpdate.setName(team.getName());
        teamToUpdate.setRating(team.getRating());

        getCurrentSession().update(teamToUpdate);
    }

    @Override
    public Team getTeam(int id) {
        Team team = (Team) getCurrentSession().get(Team.class, id);
        return team;
    }

    @Override
    public void deleteTeam(int id) {
        Team team = getTeam(id);
        if(team != null)
            getCurrentSession().delete(team);
    }

    @SuppressWarnings("unchecked")
    public List<Team> getTeams() {
        return getCurrentSession().createQuery("from Team").list();
    }

}
