@echo off
setx DB_USERNAME "postgres"
setx DB_PASSWORD "4321"
setx DB_DRIVER "org.postgresql.Driver"

setx Auth_DB_SECRET_KEY "fes"
setx Auth_DB_ISSUER "flzknr"

setx Auth_DB_DB_NAME "microservice_Auth"
setx UserProfile_DB_DB_NAME "microservice_UserProfile"
setx Agent_DB_DB_NAME "microservice_Agent"
setx Buyer_DB_DB_NAME "microservice_Buyer"
setx Properties_DB_DB_NAME "microservice_Properties"

setx GITHUB_CONFIG_PATH "https://github.com/filizhelvaci/config-server-remote.git"
setx GITHUB_USERNAME "filizhelvaci"
setx GITHUB_TOKEN_KEY "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"


