#!/usr/bin/env bash

npm install
cp -Rf node_modules/jquery/dist/*js src/main/resources/static/js/.
cp -Rf node_modules/bootstrap/dist/js/*js src/main/resources/static/js/.
cp -Rf node_modules/bootstrap/dist/css/*css src/main/resources/static/css/.
cp -Rf node_modules/angular/*js src/main/resources/static/js/.
