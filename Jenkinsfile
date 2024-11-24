pipeline  {
    agent any

    environment {                                                                                                                                                                              
        JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m -Dgosh.args=--nointeractive ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
        VERSION = "${env.BUILD_ID}"
    }
    tools {
        jdk 'OpenJDK17'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
//        stage('Unit & Integration Tests') {
//            steps {
//                script {
//                    try {
//                        sh './gradlew clean testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2 --no-daemon'
//                    } finally {
//                        junit testResults: '**/generated/test-reports/testOSGi/TEST-*.xml', skipPublishingChecks: true
//                    }
//                }
//            }
//        }
        stage('Main branch release') {
            when { 
                branch 'main' 
            }
            steps {
                echo "I am building on ${env.BRANCH_NAME}"
                sh "./gradlew clean build release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/de.avatar.connector --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                echo "I am building on ${env.JOB_NAME}"
                sh "./gradlew clean release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/de.avatar.connector"
                sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/de.avatar.connector/*"
                sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/de.avatar.connector"
            }
        }
        stage('Avatar connector provider and consumer export') {
            when {
                branch 'main'
            }
            steps {
                echo "I am building consumer and provider apps on branch: ${env.GIT_BRANCH}"

                sh "./gradlew :de.avatar.connector.isma:resolve.isma_provider --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :de.avatar.connector.other:resolve.other_provider --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :de.avatar.connector.whiteboard:resolve.consumer --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew :de.avatar.connector.isma:export.isma_provider --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"                                                        
                sh "./gradlew :de.avatar.connector.other:export.other_provider --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"                                                        
                sh "./gradlew :de.avatar.connector.whiteboard:export.consumer --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"                                                        
            }
        }

        stage('Prepare Docker') {
            when {                                                                                                                         
                branch 'main'
            }
            steps  {
                echo "I am preparing docker builds: ${env.GIT_BRANCH}"

                sh "./gradlew prepareDockerISMA --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew prepareDockerOther --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew prepareDockerWhiteboard --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

            }

        }

        stage('Docker Avatar ISMA connector provider Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/isma',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/avatar-isma-provider:latest
                                        devel.data-in-motion.biz:6000/scj/avatar-isma-provider:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
            }
        }
        stage('Docker Avatar Other connector provider Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/other',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/avatar-other-provider:latest
                                        devel.data-in-motion.biz:6000/scj/avatar-other-provider:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
            }
        }
        stage('Docker Avatar whiteboard connector Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/whiteboard',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/avatar-whiteboard:latest
                                        devel.data-in-motion.biz:6000/scj/avatar-whiteboard:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
            }
        }
    }
}
