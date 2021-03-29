package me.skiincraft.springdata;

import me.skiincraft.springdata.services.PlayerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static final String ApplicationPackage = "me.skiincraft";
    /* Application Context */
    private static AnnotationConfigApplicationContext appContext;

    public static void main(String[] args) {
        appContext = new AnnotationConfigApplicationContext();
        appContext.scan(ApplicationPackage);
        appContext.refresh();

        appContext.getBean(PlayerService.class)
                .addPlayer("SknZ");
    }

    public static AnnotationConfigApplicationContext getAppContext() {
        return appContext;
    }
}
