// vars/docker_build.groovy

def call(String projectName, String imageTag, String dockerHubUser) {
    // Enable BuildKit for modern builds
    withEnv(["DOCKER_BUILDKIT=1"]) {
        sh """
            echo "Building Docker image: ${dockerHubUser}/${projectName}:${imageTag}"
            docker buildx build \
                --progress=plain \
                -t ${dockerHubUser}/${projectName}:${imageTag} \
                .
        """
    }
}
