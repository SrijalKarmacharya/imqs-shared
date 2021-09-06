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
