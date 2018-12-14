<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora Daora</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>

            html{
                background: #2196f3;
                font-family: Arial;


            }

            #back{
                width: 500px;
                height: 500px;
                margin-left: 33%;
                margin-top:100px;
            }

            #n{
                padding: 10px;
                border-radius: 4px;
            }

            #btns{
                padding: 10px;
                border-radius: 10px;
                margin-top: 20px;
            }
            .resull{
                border: 3px dotted black;
                padding: 10px;
                border-radius: 4px;
                background: #f7e560;
                margin-top: 52px;
            }
            h1{

                font-size: 60px;
            }
        </style>
    </head>
    <body>
        <div id="back">
            <h1>Calculadora Zika</h1>
            <br>
            <form method="GET" action="/Calc/Processo">
                Numero 1: <input type="text" name="valor1" id="n" maxlength="10" />
                <br> <br>
                Numero 2: <input type="text" name="valor2" id="n" maxlength="10"/>
                <br>
                <div class="resull">
                    Resultado: <span name="resultado"> <%= request.getAttribute("resul") %> </span>
                </div>                
                <input type="submit" id="btns" name="operacao" value="Somar" />
                <input type="submit" id="btns" name="operacao" value="Subtrair" />
                <input type="submit" id="btns" name="operacao" value="Dividir" />
                <input type="submit" id="btns" name="operacao" value="Multiplicar" />
                <input type="submit" id="btns" name="operacao" value="Limpar" />
            </form>
        </div>

    </body>
</html>
