package ru.games.engine;

import java.awt.*;

/**
 * Created by Crow on 27.01.2016.
 */
public class Sprite {
    // изображение
    private Image image;

    public Sprite(Image image) {
        this.image = image;
    }

    public int getWidth() { //�������� ������ ��������
        return image.getWidth(null);
    }

    public int getHeight() { //�������� ������ ��������
        return image.getHeight(null);
    }

    public void draw(Graphics g, int x, int y) { //������ ��������
        g.drawImage(image, x, y, null);
    }
}
