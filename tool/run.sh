#!/usr/bin/env bash
set -euo pipefail

if [ "$#" -ne 1 ]; then
    echo "Error: expected 1 argument, got $#." >&2
    echo "Usage: $0 FILE" >&2
    exit 1
fi

# Run tool with file as first argument
mvn exec:java -Dexec.args="$1" -q


