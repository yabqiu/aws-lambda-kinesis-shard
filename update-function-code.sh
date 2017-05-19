#!/usr/bin/env bash

aws lambda update-function-code \
--profile saml \
--function-name kinesis-shard-test \
--zip-file fileb://target/kinesis-shard-test-1.0.jar