package ru.mintrans.mintransstartsocial.web.dto;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = CreateUserDto.Builder.class)
public class CreateUserDto {
    private final String name;
    private int password = 0;
    public static Builder builder() { return new Builder(); }

    /**
     * Конструктор сделан закрытым, потому что объекты этого класса
     * надо порождать таким образом:
     * dto = CreateUserDto.builder().setName("John Doe").build()
     */
    private CreateUserDto(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "set")
    public static class Builder {
        private int password;
        private String name;

        public Builder setName (String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword (int password) {
            this.password = password;
            return this;
        }

        public CreateUserDto build() { return new CreateUserDto(this); }
    }
}
