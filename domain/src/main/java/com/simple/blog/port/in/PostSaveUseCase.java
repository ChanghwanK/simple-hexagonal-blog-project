package com.simple.blog.port.in;

public interface PostSaveUseCase {

    void command(Command command);

    public class Command {
        private String name;

        public Command(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
