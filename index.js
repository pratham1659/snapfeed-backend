const moment = require("moment");
const simpleGit = require("simple-git");
const git = simpleGit();

const DATE = moment().subtract(1, "M").add(9, "d").format();

const data = {
  date: DATE,
};

console.log(data);

const commitMessage = "test file added";

git
  .add("./*")
  .commit(commitMessage, { "--date": DATE })
  .push("origin", "main")
  .then(() => console.log("Changes pushed successfully!"))
  .catch((err) => console.error("Error:", err));
