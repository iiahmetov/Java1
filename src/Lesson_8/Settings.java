package Lesson_8;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {

    private final MainWindow MainWindow;
    private final int Win_Height = 200;
    private final int Win_Length = 300;
    private final int Min_Win_Size = 3;
    private final int Max_Win_Size = 10;
    private final int Min_Map_Size = 3;
    private final int Max_Map_Size = 10;
    private final String Label_Win_Size = "Количество символов для победы: ";
    private final String Label_Map_Size = "Размер поля: ";

    private JRadioButton jRadioButtonHvsC = new JRadioButton("Игрок против Компьютера", true);
    private JRadioButton jRadioButtonHvsH = new JRadioButton("Игрок против Игрока");
    private ButtonGroup buttonGroup = new ButtonGroup();

    private JSlider jSliderWinSize = new JSlider();
    private JSlider jSliderMapSize = new JSlider();

    public Settings (MainWindow MainWindow){
        this.MainWindow = MainWindow;

        Rectangle MainWindowBounds = MainWindow.getBounds();
        int Pos_X = (int) (MainWindowBounds.getCenterX() - Win_Length/2);
        int Pos_Y = (int) (MainWindowBounds.getCenterY() - Win_Height/2);

        setBounds(Pos_X, Pos_Y, Win_Length, Win_Height);
        setTitle("Настройки новой игры");

        setLayout(new GridLayout(10,1));

    }

    void btnStartGameClick (){
        int gameMod;
        if (jRadioButtonHvsC.isSelected()) {
            gameMod =
        } else {
            gameMod =
        }

        int fieldSize
    }
}
