import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Clock extends JFrame {
    private JLabel clockLabel;
    private JTextField timezoneField;
    private JButton createClockButton;

    public Clock() {
        setTitle("Continuous Running Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        clockLabel = new JLabel();
        add(clockLabel);

        timezoneField = new JTextField(10);
        add(timezoneField);

        createClockButton = new JButton("Create Clock");
        createClockButton.addActionListener(e -> createNewClock());
        add(createClockButton);

        setVisible(true);

        // Start the clock
        startClock();
    }

    private void startClock() {
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                Date now = new Date();
                clockLabel.setText(sdf.format(now));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
    private void createNewClock() {
        String timezone = timezoneField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        try {
            Date time = sdf.parse(timezone);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            String formattedTime = sdf.format(time);
            ClockFrame clockFrame = new ClockFrame(formattedTime, timezone);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format. Please enter time in HH:mm:ss format.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Clock());
    }
}

class ClockFrame extends JFrame {
    public ClockFrame(String formattedTime, String timezone) {
        setTitle("Clock for Timezone: " + timezone);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(200, 100);
        setLayout(new FlowLayout());

        JLabel clockLabel = new JLabel();
        add(clockLabel);

        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            while (true) {
                Date now = new Date();
                clockLabel.setText(formattedTime);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        setVisible(true);
    }
}


