#!/bin/bash
set -e

# Optional ARGS env variable support plus additional CLI args
# Example: ARGS="--info" docker run ... OR pass args directly to the container
ARGS="${ARGS:-}"

./gradlew test ${ARGS} "$@"
