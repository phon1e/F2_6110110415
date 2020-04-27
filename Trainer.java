import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private ArrayList<Ball> pokeBag;                  // bag list
    private Scanner sc;
    private String name, nickname;


    public Trainer(String name){
        bag = new ArrayList<Pokemon>();
        pokeBag = new ArrayList<Ball>();

        bag.add(new Pikachu("Pikachu"));
        pokeBag.add(new Pokeball("Pokeball"));
        
        sc = new Scanner(System.in);
        this.name = name;
    }
        
    public String getName(){
        return this.name;
    }

    public String setNickName(){
        nickname = sc.nextLine();
        name = nickname;
        return name;
    }

    public void play(){
        String cmd =  "";
       
        do{
            System.out.print(" Type Command : (show/catch/restore/quit) : ");      //start game menu
            cmd = sc.nextLine();
            if(cmd.equals("show")){
                System.out.print(">> Pokemon right now ! <<\nPokemons in your bag \n\n");
                showPokemon(bag);
                
            }else if(cmd.equals("catch")){
                catchPokemon();
            }

        }while(!cmd.equals("quit"));
        
    }
    
    public void catchPokemon(){                                             // catch func.
        System.out.println("Catch ! ! ");   
        ArrayList<Pokemon> pokemons = PokemonRand.getPokemons(5);           //call PokemonRandom 
        ArrayList<Ball> pokeBalls = PokeballRand.getPokemonballs(1);

        System.out.println("Pokemon around you");
        int no = 0;
        for(Pokemon p: pokemons){
            System.out.println("No. "+ no +" "+p.getName() + " HP: "+p.getHp());    //print pokemon around player
            no++;
        }

        System.out.println("\nSelect Target");                              //select target to fight/catch
        no = sc.nextInt();
        Pokemon wildPokemon = pokemons.get(no);
        System.out.println("\nSelect pokemon in bag: ");                //select your own pokemon
        showPokemon(bag);   
        no = sc.nextInt();
        Pokemon myPoke = bag.get(no);
        
        System.out.println("\nSelect Pokeball : ");
        showPokeball(pokeBag);
        no = sc.nextInt();
        Ball ballRand = pokeBalls.get(no);

        boolean isWin = false;                                          
        do{
            myPoke.attack(wildPokemon);
            if (wildPokemon.getHp() == 0){
                isWin = true;
                break;
            }else{
                wildPokemon.attack(myPoke);
                if(myPoke.getHp() == 0){
                    isWin = false;
                    break;
                }
            }
        }while(true);

        if(isWin){ 
            String s = "";
            if(wildPokemon.catchR < ballRand.chance){                                               //check isWin?catch:wild pokemon escape
                System.out.println("You catch : "+ wildPokemon.getName());
                System.out.println("Do you want to set Nickname? Y/N");
                s = sc.nextLine(); 
                if(s.equals("Y")){
                    System.out.println("Set Nickname: ");
                    setNickName();
                    bag.add(pokemons.get(no));
                }else
                    bag.add(pokemons.get(no));
            }    
        }else
            System.out.println(wildPokemon.getName() + " won ");

        sc.nextLine();

    }
    public void showPokemon(ArrayList<Pokemon> pokemons){                       //func for show pokemon name, hp
        int num = 0;
        for(Pokemon p:bag){
            System.out.println("" + num + " " + p +" HP: " +p.getHp());
            num++;
        }
    }

    public void showPokeball(ArrayList<Ball> pokeBalls){
        int num = 0;
        for(Ball b:pokeBag){
            System.out.println("" + num +" " + b);
            num++;
        }
    }
    public ArrayList<Pokemon> getBag(){
        return bag;
    }

    public ArrayList<Ball> getBallBag(){
        return pokeBag;
    }
    
}