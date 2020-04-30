import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private ArrayList<Ball> pokeBag;                  // bag list
    private Scanner sc;
    protected String name, nickname;


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

    public String setNickName(String nickname){
        name = nickname;
        return name;
    }

    public void play(){                                                     //play function
        String cmd =  "";
       
        do{
            System.out.print(" Type Command : (show/catch/quit) : ");      //start game menu
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
        ArrayList<Ball> pokeBalls = PokeballRand.getPokemonballs(2);

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
            int n = (int)((Math.random() * 4) + 1);                                   //(int)((Math.random() * max-min) + min);
            int ans ;
            String s="";
            if(myPoke.hp > wildPokemon.hp){                                               //check isWin?catch:wild pokemon escape
                System.out.println("You win ! " + " you catch " + wildPokemon.getName());
                
                wildPokemon.name = setNickName(s);
                
                System.out.println("Gacha Restore!  choose 1-5");
                ans = sc.nextInt(); 

            if(ans == n){                                                               //gacha restore answer correct hpx2 wrong hpx1
                System.out.println("Correct! restore x2");                                  
                restore(bag);
                bag.add(pokemons.get(no));
                
            }else
                System.out.println("Wrong");                                        
                restore(bag);
                bag.add(pokemons.get(no));
                
            }    
        }else
            System.out.println(wildPokemon.getName() + " won ");

    }

    public void showPokemon(ArrayList<Pokemon> pokemons){                       //func for show pokemon name, hp
        int num = 0;
        for(Pokemon p:bag){
            System.out.println("" + num + " " + p +" HP: " +p.getHp());
            num++;
        }
    }

    public void showPokeball(ArrayList<Ball> pokeBalls){                    //show pokeball in bag
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

    public void restore(ArrayList<Pokemon> pokemons){                   //restore hp
        for(Pokemon p:bag){
            p.hp = p.getHp()*2;
        }
    }
}