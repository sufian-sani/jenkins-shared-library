// vars/docker_build.groovy
def call(String projectName, String imageTag, String dockerHubUser) {
    withEnv(["DOCKER_BUILDKIT=1"]) {
        sh """
            echo "Building Docker image: ${dockerHubUser}/${projectName}:${imageTag}"
            docker build -t ${dockerHubUser}/${projectName}:${imageTag} .
        """
    }
}
