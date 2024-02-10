package phao_hoa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Fireworks extends JFrame {
    private static final int WIDTH = 800;  // Set an appropriate width
    private static final int HEIGHT = 600;
    private static final Random random = new Random();
    private static final int PARTICLE_COUNT = 100;
    private static final int PARTICLE_SIZE = 5;

    private static class Particle {
        int x, y;
        Color color;

        public Particle(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    private final List<Particle> particles;

    private final JPanel fireworksPanel;

    public Fireworks() {
        setTitle("Fireworks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        particles = new ArrayList<>();

        fireworksPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Particle particle : particles) {
                    g.setColor(particle.color);
                    g.fillOval(particle.x, particle.y, PARTICLE_SIZE, PARTICLE_SIZE);
                }
            }
        };

        add(fireworksPanel);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateParticles();
                fireworksPanel.repaint();
            }
        });
        timer.start();
    }

    private void updateParticles() {
        particles.clear();

        for (int i = 0; i < PARTICLE_COUNT; i++) {
            int x = WIDTH / 2;
            int y = HEIGHT / 2;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            particles.add(new Particle(x, y, color));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Fireworks fireworks = new Fireworks();
            fireworks.pack();
            fireworks.setVisible(true);
        });
    }
}
