@Library('first-shared-lib') _
// restapi {
// }

// @Library('first-shared-lib') _
// node {
//   stage("checking stage 1") {
//     checking()
//   }
//   stage("checking stage 2") {
//     checking.calling()
//   }
// }

// @Library('first-shared-lib') _
// node {
//   checking.calling1()
//   checking.calling2()
// }


// pipeline {
//   agent any 
  
//   stages {
//     stage('checking branch') {
//       when {
//         expression{env.BRANCH_NAME == 'main' || env.BRANCH_NAME == 'test'}
//       }
      
//       steps {
//         script {
//           echo "${BRANCH_NAME}"
//         }
//       }
//     }
//   }
  
// }
pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          restapi.listsOfMachine();
          restapi.statusOfMachine();
          restapi.createMachine();
          restapi.startMachine();
          restapi.stopMachine();
          restapi.updateMachine();
        }
      }
    }
  }
}
