## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Migrasi java 8 to java 11
## Lambda Expression

## Local variabel (var init)

## new API 

### (java.net.http.HttpClient)

HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("https://example.com"))
      .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


### Collection.toArray(IntFunction<T[]>):

String[] arr = list.toArray(String[]::new);
Optional.ifPresentOrElse, Optional.stream, Optional.or (Java 9).

### String API baru (Java 11):

isBlank(), lines(), repeat(n), strip().

"  halo ".strip(); // "halo"
"a\nb\nc".lines().forEach(System.out::println);

### Files.writeString() & Files.readString() (Java 11).


## Lambda & Stream API

Stream.takeWhile, Stream.dropWhile, Stream.iterate (Java 9).

Collectors.flatMapping (Java 9).

Optional.stream() (Java 9).

## Deprecations & Removals

### Java EE & CORBA Modules dihapus di Java 11:

javax.xml.bind (JAXB), javax.activation, javax.annotation, javax.jws, javax.xml.ws.

Solusi: tambahkan dependency eksternal (misalnya Jakarta EE).

### JavaFX tidak lagi bundled (perlu install terpisah).

### Nashorn JavaScript Engine deprecated di Java 11.

