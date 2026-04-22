def call() {
    echo "Deploying application..."
    sh 'kubectl apply -f deployment.yaml'
}
