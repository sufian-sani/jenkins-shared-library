// vars/dockerBuild.groovy
def call(String ProjectName, String ImageTag, String DockerHubUser) {
    sh """
        export DOCKER_BUILDKIT=0
        docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} .
    """
}
