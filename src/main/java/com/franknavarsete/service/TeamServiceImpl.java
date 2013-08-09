package com.franknavarsete.service;

import com.franknavarsete.dao.TeamDAO;
import com.franknavarsete.dao.TeamDAOImpl;
import com.franknavarsete.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Frank
 * Date: 08.08.13
 * Time: 19:12
 */
@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDAO teamDAO;

    @Override
    public void addTeam(Team team) {
        teamDAO.addTeam(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamDAO.updateTeam(team);
    }

    @Override
    public Team getTeam(int id) {
        return teamDAO.getTeam(id);
    }

    @Override
    public void deleteTeam(int id) {
        teamDAO.deleteTeam(id);
    }

    @Override
    public List<Team> getTeams() {
        return teamDAO.getTeams();
    }
}
