/*
 * 
 * You can use the following import statements
 * import org.springframework.jdbc.core.RowMapper;
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * 
 */

// Write your code here
package com.example.song.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song> {

    public Song mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Song(

                resultSet.getInt("songId"),
                resultSet.getString("songName"),
                resultSet.getString("lyricist"),
                resultSet.getString("singer"),
                resultSet.getString("musicDirector"));

    }
}
