#!/bin/bash

### apply template files
ROOT=$(git config --get ghq.root)
DEST="$ROOT/github.com/liquidz/jubot-template/resources/leiningen/new/jubot"
TARGET=("LICENSE" "Procfile" "README.md" "src/myjubot/core.clj" "src/myjubot/sample.clj" "test/myjubot/sample_test.clj" "project.clj" "dev/user.clj")

for FILE_PATH in ${TARGET[@]}; do
    BASE_NAME=$(basename $FILE_PATH)
    cat $FILE_PATH \
        | grep -v "DELME" \
        | sed 's/MYJUBOT/{{sanitized}}/g' \
        | sed 's/myjubot/{{name}}/g' \
        > "$DEST/$BASE_NAME"
done

### update project version
VERSION=$(grep "\[jubot " project.clj | awk -F'"' '{print $2}')
TMPL_PROJ="$ROOT/github.com/liquidz/jubot-template/project.clj"
TMP="${TMPL_PROJ}.new"

echo "(defproject jubot/lein-template \"$VERSION\"" > $TMP
grep -v "defproject jubot/lein-template" $TMPL_PROJ >> $TMP
\mv -f $TMP $TMPL_PROJ