Para ejecutar la API, se debe utilizar las siguientes URLs

GET ALL/GET ONE/UPDATE/CREATE/DELETE:
https://heroku-mutant.herokuapp.com/api/v1/mutants/

Para ingresar arreglo de Strings (adn) y comprobar si es mutante:
https://heroku-mutant.herokuapp.com/api/v1/mutants/ismutant
Se recomienda seguir el siguiente formato (ejemplo de matriz 6x6):
{
 "dna": [
            "XXXXXX",
            "XXXXXX",
            "XXXXXX",
            "XXXXXX",
            "XXXXXX",
            "XXXXXX"
        ]
 }

para verificar stats y ratio de mutantes/humanos: 
https://heroku-mutant.herokuapp.com/api/v1/mutants/stats
