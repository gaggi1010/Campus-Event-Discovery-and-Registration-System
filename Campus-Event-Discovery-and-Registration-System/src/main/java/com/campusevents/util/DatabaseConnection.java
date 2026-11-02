package com.campusevents.util;
import java.sql.*;import java.nio.file.*;
public final class DatabaseConnection {private DatabaseConnection(){}public static Connection get()throws SQLException{try{Files.createDirectories(Path.of("data"));}catch(Exception e){throw new SQLException(e);}Connection c=DriverManager.getConnection("jdbc:sqlite:data/campus_events.db");try(Statement s=c.createStatement()){s.execute("PRAGMA foreign_keys=ON");s.execute("PRAGMA busy_timeout=5000");}return c;}}
