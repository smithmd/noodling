# noiseparticles.com

This is the port of noiseparticles.com to work on Heroku in Clojure

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## Deploying to Heroku

    git subtree push --prefix Clojure/web/noiseparticles heroku-np master

## License

Copyright © 2014 WHATEVERIDONTCARE
