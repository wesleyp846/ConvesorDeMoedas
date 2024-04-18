1) ### Criação do repositório no `Github`

No `Intellij` via terminal

    git remote add origin https://github.com/wesleyp846/ConvesorDeMoedas.git
    git branch -M main
    git add .
    git commit -m "initial commit"
    push -u origin main

2) ### Etapa de Coding


foi utilizada uma api externa para consulta da cotações de moedas
https://app.exchangerate-api.com/

impresão na tela da primeira requisição

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://v6.exchangerate-api.com/v6/<CHAVE DE SUA API>/latest/USD"))
        .build();
    HttpResponse<String> response = client
        .send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());


