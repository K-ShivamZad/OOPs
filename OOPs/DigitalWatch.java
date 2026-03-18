import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalWatch {
    private JFrame frame;
    private JLabel label;

    DigitalWatch() {
        frame = new JFrame();
        label = new JLabel("", SwingConstants.CENTER);
        label.setBounds(100, 100, 100, 50);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();
    }

    private void updateClock() {
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        Date date = calendar.getTime();
        String timeString = formatter.format(date);

        label.setText(timeString);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DigitalWatch());
    }
}
