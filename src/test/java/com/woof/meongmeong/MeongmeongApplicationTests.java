package com.woof.meongmeong;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class MeongmeongApplicationTests {

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {

        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:oracle:thin:@meong_high?TNS_ADMIN=./src/main/resources/Wallet_meong",
                            "meong",
                            "wodusWkd1234!")){
            System.out.println(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
