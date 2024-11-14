package com.hadiyasa.spring_core;

public class Database {
    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    // dibuat private agar object tidak bisa dibuat di luar kelas
    // hanya dibisa dibuat di dalam getInstance();
    private Database(){

    }
}
