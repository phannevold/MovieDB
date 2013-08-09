package com.franknavarsete.service;

import com.franknavarsete.model.Team;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Frank
 * Date: 08.08.13
 * Time: 19:08
 */
public interface TeamService {

    public void addTeam(Team team);
    public void updateTeam(Team team);
    public Team getTeam(int id);
    public void deleteTeam(int id);
    public List<Team> getTeams();
}
