package sgcib.kata.wordle;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
public class WordleMain {

    public static void main(String[] args) {
        SpringApplication.run(WordleMain.class, args);
    }

    @Bean
    public PromptProvider myPromptProvider() {
        return () -> new AttributedString("wordle> ", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
    }
}
