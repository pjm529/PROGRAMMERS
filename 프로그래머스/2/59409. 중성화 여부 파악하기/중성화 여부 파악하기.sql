SELECT animal_id, name, 
    case 
    when sex_upon_intake like '%Neutered%' or sex_upon_intake like '%Spayed%' then 'O' 
    else 'X' end as "중성화"
FROM ANIMAL_INS