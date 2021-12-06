package ru.netology.graphics;

import ru.netology.graphics.converter.Converter;
import ru.netology.graphics.converter.ColorSchema;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;


public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter(); // Создайте тут объект вашего класса конвертера
        converter.setTextColorSchema(new ColorSchema(ColorSchema.MY_STRANGE_SCHEMA));
        converter.setMaxRatio(1.546d);

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

    }
}