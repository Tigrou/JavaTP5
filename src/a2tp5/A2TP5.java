package a2tp5;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;

/**
 *
 * @author Tigrou
 */
public class A2TP5 {

    public static void main(String[] args) throws Exception {

        // ajout d'un son
        File son = new File("Son/son1.wav");
        AudioClip clip = null;
        try {
            clip = Applet.newAudioClip(son.toURL());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        clip.loop();

        //Connexion à mon serveur
        Socket socket = new Socket("localhost", 4444);

        //to get the ip address
        System.out.println((java.net.InetAddress.getLocalHost()).toString());

        //Création des outils ecriture et lecture
        PrintWriter outSocket = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Fenetre maFenetre = new Fenetre();
        maFenetre.setVisible(true);

        int nbPieces = Integer.valueOf(inSocket.readLine());
        for (int i = 0; i < nbPieces; i++) {
            String nomPiece = inSocket.readLine();
            maFenetre.afficherPieces(nomPiece);
        }

        do {
            maFenetre.appuyerBouton();
        } while (maFenetre.appuiBouton == false);
        outSocket.println(maFenetre.nameF);
        outSocket.println(maFenetre.pieceChoisie);
        outSocket.println(maFenetre.nbPlacesChoisies);
        maFenetre.setTextgetjLabel(Integer.valueOf(inSocket.readLine()));
    }
}
