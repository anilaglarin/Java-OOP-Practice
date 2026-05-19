import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class KostebekOyunu extends JFrame {
    private int kostebekX = 150, kostebekY = 50; // Köstebek pozisyonu
    private int yercekimi = 2; // Aşağı düşme hızı
    private int ziplamaGucu = -20; // Zıplama yüksekliği
    private ArrayList<Rectangle> kayalar = new ArrayList<>(); // Engeller
    private Random rand = new Random();
    private int skor = 0;
    private boolean oyunBitti = false;

    public KostebekOyunu() {
        setTitle("Kaçışan Köstebek");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Tuş dinleyici
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (oyunBitti) {
                        // Oyunu yeniden başlat
                        kayalar.clear();
                        kostebekY = 50;
                        skor = 0;
                        oyunBitti = false;
                    } else {
                        yercekimi = ziplamaGucu; // Zıpla
                    }
                }
            }
        });

        // Oyun döngüsü
        Timer timer = new Timer(20, e -> {
            if (!oyunBitti) {
                yercekimi += 1; // Yerçekimi artar
                kostebekY += yercekimi; // Köstebek düşer

                // Yeni kaya ekle (rastgele)
                if (rand.nextInt(100) < 2) {
                    int kayaGenislik = rand.nextInt(50) + 20;
                    kayalar.add(new Rectangle(rand.nextInt(getWidth() - kayaGenislik), -20, kayaGenislik, 20));
                }

                // Kayaları hareket ettir
                for (int i = 0; i < kayalar.size(); i++) {
                    Rectangle kaya = kayalar.get(i);
                    kaya.y += 5; // Kayalar aşağı iner

                    // Çarpışma kontrolü
                    if (kaya.intersects(kostebekX, kostebekY, 30, 30)) {
                        oyunBitti = true;
                    }

                    // Skor artır (kaya ekrandan çıkınca)
                    if (kaya.y > getHeight()) {
                        kayalar.remove(i);
                        skor++;
                    }
                }

                // Sınır kontrolü
                if (kostebekY > getHeight() || kostebekY < 0) {
                    oyunBitti = true;
                }
            }
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Arkaplan
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Köstebek (kahverengi daire)
        g.setColor(new Color(139, 69, 19)); // Kahverengi
        g.fillOval(kostebekX, kostebekY, 30, 30);

        // Kayalar (siyah dikdörtgenler)
        g.setColor(Color.BLACK);
        for (Rectangle kaya : kayalar) {
            g.fillRect(kaya.x, kaya.y, kaya.width, kaya.height);
        }

        // Skor
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Skor: " + skor, 10, 20);

        // Oyun bitti ekranı
        if (oyunBitti) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("OYUN BİTTİ!", 100, 200);
            g.drawString("Skor: " + skor, 100, 250);
            g.drawString("Tekrar başlamak için BOŞLUK tuşuna bas", 10, 300);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new KostebekOyunu().setVisible(true);
        });
    }
}