import java.util.Scanner;

public class tamagochi {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        boolean empezar = true;

        String respEmpezar, nomTamagotchi;
        int aspectoTamagotchi;
        String aspectoTamagotchiP = "";
        boolean aspecto=true;
        int respAspecto;
        while (empezar) {
            System.out.println("Bienvenido a Tamagotchi");
            System.out.println("Quieres empezar a jugar? (SI/NO)");
            respEmpezar= sc.next();

            if (respEmpezar.equalsIgnoreCase("NO")){
                empezar=false;
                System.out.println("Que lastima, nos vemos pronto");
            }
            while (aspecto) {

                System.out.println("Introduce el nombre de tu tamagotchi: ");
                nomTamagotchi = sc.next();
                System.out.println("Muy bien, ahora escoge la apariencia que quieres que tenga " + nomTamagotchi);
                System.out.println("Aquí hay un menú de aspectos:");
                System.out.println("1) 🐷\n2) 🐶\n3) 🐱\n4) 🐺\n5) 🐰\n6) 🐯\n7) 🦊\n8) 🐼\n9) 🐸\n10) 🐨");
                aspectoTamagotchi = sc.nextInt();
                switch (aspectoTamagotchi) {
                    case 1:
                        aspectoTamagotchiP = "🐷";
                        break;
                    case 2:
                        aspectoTamagotchiP = "🐶";
                        break;
                    case 3:
                        aspectoTamagotchiP = "🐱";
                        break;
                    case 4:
                        aspectoTamagotchiP = "🐺";
                        break;
                    case 5:
                        aspectoTamagotchiP = "🐰";
                        break;
                    case 6:
                        aspectoTamagotchiP = "🐯";
                        break;
                    case 7:
                        aspectoTamagotchiP = "🦊";
                        break;
                    case 8:
                        aspectoTamagotchiP = "🐼";
                        break;
                    case 9:
                        aspectoTamagotchiP = "🐸";
                        break;
                    case 10:
                        aspectoTamagotchiP = "🐨";
                        break;


                }
                System.out.println("Entonces su tamatogchi se llama: " + nomTamagotchi);
                System.out.println("Y se ve asi: " + aspectoTamagotchiP);

                System.out.println("Quieres seguir o quieres modificar algo antes de empezar?");
                System.out.println("1)Quiero seguir\n2)Quiero modificar algo antes de empezar");
                respAspecto=sc.nextInt();

                if (respAspecto==2) {
                    aspecto=true;
                    System.out.println("Okay volvamos a empezar");

                }

            }

        }

    }
}
