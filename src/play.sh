isBatsman=1
isBowlers=2
isplayer=3
player=""
i=0
j=0
k=0
a=0
x=0

for ((l=0; l<=1; l++))
do 
    echo "Please Choose yours Options"
    read -p "
    1. Batsman 
    2. Bowler 
    3. Exit
    " a 
    if [ $a == $isBatsman ]
    then
        player='"Batsman"'
        elif [ $a == $isBowlers ]
    then
        player='"Bowler"'
        elif [ $a == isplayer ]
    then
        clear
    else
        echo "Please choose yours correct Options like 1. Batsman 2. Bowlers "
    fi
        echo "Please enter $player name"


function bat_man()
{
if [ "${batsman[i]}" = "${bowlers[j]}" ]
then 
    echo "Sucsessfully Entered $player names are listed below"
    echo  "    Bowler Name (1): '${batsman[0]}' 
    Bowler Name (2): '${batsman[1]}' 
    Bowler Name (3): '${batsman[2]}' "
else
  echo "Sorry ! Your Given $player is not processed  : ( "
fi
}

function ball_man()
{
if [ "${batsman[i]}" = "${bowlers[j]}" ]
then  
    echo "Sucsessfully Entered $player names are listed below"
    echo  "    Bowler Name (1): '${bowlers[0]}' 
    Bowler Name (2): '${bowlers[1]}' 
    Bowler Name (3): '${bowlers[2]}' "
else
  echo "Sorry ! Your Given $player is not processed  : ( "
fi
}

function compare()
{
if [ "${batsman[i]}" == "${bowlers[j]}" ]
then 
    echo "$player names contains Validation"
elif [ "${batsman[i]}" == "${batsman[i]}" ]
then
    echo "$player ${batsman[i]} is equal"
elif [ "${bowlers[j]}" == "${bowlers[j]}" ]
then
    echo "$player ${bowlers[j]} is equal"
elif [ "${batsman[i]}" \< "${bowlers[j]}" ]
then
    echo "${batsman[i]} Batsman is smaller then ${bowlers[j]} Bowler"
elif [ "${batsman[i]}" \> "${bowlers[j]}" ]
then 
    echo "${bowlers[j]} Bowler is smaller then ${batsman[i]} Batsman"
else
    echo "String are equal"
fi
}

function back()
{
    clear
}

    case $a in 
    1) 
    for ((i=0; i<=2; i++))
        do 
            read -p "Enter your Batsman $((i+1)) :" batsman[i]
        done
    bat_man
    compare
    ;; 
    2) 
        for ((j=0; j<=2; j++))
        do 
            read -p "Enter your Bowler $((j+1)) :" bowlers[j]
        done
    ball_man
    bat_man
    compare
    ;;
    3) 
    back
    exit 
    ;;
    *) 
        echo "Sorry Your Given Players Is Not Validated ! Try Again :("
        break;
    ;;
    esac
done 

