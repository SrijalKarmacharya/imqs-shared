def call(Map config = [:]) {
  echo "checking 1"
  def get = new URL("http://localhost:8012/post").openConnection();
  echo "checking 2"
  def getRC = get.getResponseCode();
  echo "checking 3"
  println(getRC);
  echo "checking 4"
  if(getRC.equals(200)) {
    println(get.getInputStream().getText());
  }
}

def post(Map config = [:]) {
  // POST
  echo "checking 1"
  def post = new URL("http://localhost:8012/status/1").openConnection();
  echo "checking 2"
  def message = '{"message":"this is a message"}'
  echo "checking 3"
  post.setRequestMethod("POST")
  echo "checking 4"
  post.setDoOutput(true)
  echo "checking 5"
  post.setRequestProperty("Content-Type", "application/json")
  echo "checking 6"
  post.getOutputStream().write(message.getBytes("UTF-8"));
  echo "checking 7"
  def postRC = post.getResponseCode();
  echo "checking 8"
  println(postRC);
  echo "checking 9"
  if(postRC.equals(200)) {
    println(post.getInputStream().getText());
  }
