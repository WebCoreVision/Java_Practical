import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BoundingBallsDemo extends JPanel {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int NUM_BALLS = 5;
    private Ball[] balls;

    public BoundingBallsDemo() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        balls = new Ball[NUM_BALLS];

        // Create balls with random initial positions, velocities, and colors
        for (int i = 0; i < NUM_BALLS; i++) {
            balls[i] = new Ball();
            Thread ballThread = new Thread(balls[i]);
            ballThread.start();
        }

        // Handling window close event
        JFrame frame = new JFrame("Bouncing Balls Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Start a timer to repaint the panel at a regular interval
        Timer timer = new Timer(10, e -> repaint());
        timer.start();
    }

    // Override the paint method to draw balls
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            g.setColor(ball.getColor());
            g.fillOval(ball.getX(), ball.getY(), Ball.DIAMETER, Ball.DIAMETER);
        }
    }

    // Ball class representing each bouncing ball
    class Ball implements Runnable {
        static final int DIAMETER = 30;
        private int x, y, dx, dy;
        private final Color color;
        private final Random rand = new Random();

        public Ball() {
            this.x = rand.nextInt(WIDTH - DIAMETER);
            this.y = rand.nextInt(HEIGHT - DIAMETER);
            this.dx = rand.nextInt(5) + 1; // Random horizontal speed
            this.dy = rand.nextInt(5) + 1; // Random vertical speed
            this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }

        public void run() {
            while (true) {
                move();
                try {
                    Thread.sleep(10); // Slow down the movement for smooth animation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Move the ball, bouncing off walls
        private void move() {
            if (x + dx < 0 || x + dx > WIDTH - DIAMETER) {
                dx = -dx; // Reverse horizontal direction if hitting left or right wall
            }
            if (y + dy < 0 || y + dy > HEIGHT - DIAMETER) {
                dy = -dy; // Reverse vertical direction if hitting top or bottom wall
            }
            x += dx;
            y += dy;
        }

        // Getters for ball position and color
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Color getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BoundingBallsDemo::new);
    }
}
