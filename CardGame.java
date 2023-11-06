import java.util.Scanner; 
    
    public class CardGame{
    
        public static void main(String[]args)  
        {
            Scanner scanner= new Scanner(System.in);   
                



                System.out.print("Enter a character for your card 'c' for club 's' for Spade 'd'for diamond and 'h' for Hearts.");
                char character = scan.next() .chartAt(0);
                String characterCard;
                
                switch(characterCard){
                    case c:
                        characterCard="Clubs";
                        break;
                            case s:
                                characterCard="Spade";
                                break;
                                    case d:
                                        characterCard="Diamond";
                                            break;
                                                case h:
                                                    characterCard="Heart";
                                                    break;
                }
                System.out.println("Card:"+characterCard);
                



                int card;
                boolean validCard = false;

                    while(!validCard){
                        System.out.print("Enter your card and suit");
                         if(scanner.hasNextInt())
                            {
                                card = scanner.nextInt();
                                 if(card>=1&&card<=10)
                                    {
                                        validCard=true;
                                         if(card>=5)
                                            {
                                                System.out.println("Nice card");
                                         }
                                                else{
                                                 System.out.println("Good luck");
                                            } 
                                                    
                                            }
                                    }
                            }
                        }
    }


        
