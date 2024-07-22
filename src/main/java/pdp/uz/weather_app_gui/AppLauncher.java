package pdp.uz.weather_app_gui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class AppLauncher {

    public static void main(String[] args) {
//        SpringApplication.run(AppLauncher.class, args);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGui().setVisible(true);
            }
        });
    }

}
