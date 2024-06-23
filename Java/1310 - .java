import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ESSFootball {

  private static class Equipo implements Comparable<Equipo> {

    public String nombre;
    public int puntos;
    public int partidos;

    public int victorias, empates, derrotas;
    public int golesFavor, golesContra;

    public Equipo(String nombre) {
      this.nombre = nombre;
      puntos =
        partidos =
          victorias = empates = derrotas = golesFavor = golesContra = 0;
    }

    public int diferenciaGoles() {
      return golesFavor - golesContra;
    }

    @Override
    public int compareTo(Equipo o) {
      if (this.puntos > o.puntos) {
        return -1;
      } else if (this.puntos < o.puntos) {
        return 1;
      }

      if (this.victorias > o.victorias) {
        return -1;
      } else if (this.victorias < o.victorias) {
        return 1;
      }

      if (this.diferenciaGoles() > o.diferenciaGoles()) {
        return -1;
      } else if (this.diferenciaGoles() < o.diferenciaGoles()) {
        return 1;
      }

      if (this.golesFavor > o.golesFavor) {
        return -1;
      } else if (this.golesFavor < o.golesFavor) {
        return 1;
      }

      if (this.partidos < o.partidos) {
        return -1;
      } else if (this.partidos > o.partidos) {
        return 1;
      }

      return this.nombre.compareToIgnoreCase(o.nombre);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in),
      1024 * 8
    );
    StringTokenizer tk;

    int nTorneos = Integer.parseInt(br.readLine());

    while (nTorneos-- > 0) {
      String nombreTorneo = br.readLine();
      int nEquipos = Integer.parseInt(br.readLine());

      Equipo[] equipos = new Equipo[nEquipos];

      for (int i = 0; i < nEquipos; i++) {
        String equipoAux = br.readLine();
        equipos[i] = new Equipo(equipoAux);
      }

      int nJuegos = Integer.parseInt(br.readLine());

      for (int i = 0; i < nJuegos; i++) {
        tk = new StringTokenizer(br.readLine(), "@");

        String[] info1 = tk.nextToken().split("#");
        String[] info2 = tk.nextToken().split("#");

        String nombreEquipo1 = info1[0];
        int golesEquipo1 = Integer.parseInt(info1[1]);

        String nombreEquipo2 = info2[1];
        int golesEquipo2 = Integer.parseInt(info2[0]);

        actualizaEquipo(nombreEquipo1, golesEquipo1, golesEquipo2, equipos);
        actualizaEquipo(nombreEquipo2, golesEquipo2, golesEquipo1, equipos);
      }

      Arrays.sort(equipos);
      System.out.println(nombreTorneo);
      for (int i = 0; i < equipos.length; i++) {
        Equipo aux = equipos[i];
        System.out.println(
          (i + 1) +
          ") " +
          aux.nombre +
          " " +
          aux.puntos +
          "p, " +
          aux.partidos +
          "g (" +
          aux.victorias +
          "-" +
          aux.empates +
          "-" +
          aux.derrotas +
          "), " +
          aux.diferenciaGoles() +
          "gd (" +
          aux.golesFavor +
          "-" +
          aux.golesContra +
          ")"
        );
      }
      if (nTorneos > 0) System.out.println();
    }
  }

  public static void actualizaEquipo(
    String nombreEquipo,
    int golesFavor,
    int golesContra,
    Equipo[] equipo
  ) {
    for (int i = 0; i < equipo.length; i++) {
      if (equipo[i].nombre.equals(nombreEquipo)) {
        equipo[i].golesFavor += golesFavor;
        equipo[i].golesContra += golesContra;
        equipo[i].partidos++;

        if (golesFavor > golesContra) {
          equipo[i].victorias++;
          equipo[i].puntos += 3;
        } else if (golesFavor < golesContra) {
          equipo[i].derrotas++;
        } else {
          equipo[i].empates++;
          equipo[i].puntos++;
        }
      }
    }
  }
}
