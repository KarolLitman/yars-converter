# YARS Converter

YARS converter written in Java running from command-line interface (CLI). This converter allows conversion from YARS to known types such as Turtle, RDF Reification, Named graph, Singleton Property, RDF* and N-ary Relation.

## Getting Started

You can download and use the ready-made application located in the [realases](https://github.com/KarolLitman/yars-converter/releases) or [clone](https://help.github.com/articles/cloning-a-repository/) the repository and build it.

### Prerequisites

you need two libraries to build the project
* [antlr4 library](https://github.com/antlr/antlr4/blob/master/doc/java-target.md)
* [Apache Commons CLI](https://github.com/apache/commons-cli) 

### Example ussage

```
java -jar converter.jar -f sp -i graph.yars
```

The example shows loading graph.yars file and displaying data in Singleton Property format

Running YARS Converter without parameters shows help.

* `-i,--input <arg>` - input YARS file path *(required)
* `-f,--format <arg>` - output format (ttl, rr, ng, sp, rs, nr) *(required)


### Output formats

* `ttl` - Turtle (skips reifications)
* `rr` - RDF Reification
* `ng` - Named graph
* `sp`- Singleton Property
* `rs` - RDF*
* `nr` - N-ary relation



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
