#!/usr/bin/env bash

aws lambda create-function \
--profile saml \
--function-name kinesis-shard-test \
--runtime java8 \
--role "arn:aws:iam::547044695525:role/lambda_basic_execution" \
--handler cc.unmi.kinesis.Handler \
--description "Kinesis shard in series test" \
--zip-file fileb://target/kinesis-shard-test-1.0.jar