graph LR

  Parent --> Common
  Parent --> Common2.x
  Parent --> IdolComponent-base
  Parent --> smarta-containerizing
  Parent --> smarta-saw-proxy
  Parent --> smarta-smart-ticket-admin-ui
  Parent --> smarta-admin-ui-backend

  smarta-admin-ui --> smarta-admin-ui-backend

  IdolComponent-base --> IdolComponent

  Common --> idol-client

  idol-client --> D

  D --> smarta-smart-ticket
  D --> smarta-smart-ticket-task
  D --> SmartSearchService
  D --> smarta-data-source
  D --> OCRService
  
  Common2.x --> Installer
  smarta-containerizing --> Installer
  IdolComponent --> Installer

  smarta-smart-ticket --> DC[smarta-deploy-controller]
  smarta-smart-ticket-task --> DC
  smarta-smart-ticket-admin-ui --> DC
  SmartSearchService --> DC
  configuration-service --> DC
  smarta-admin-ui-backend --> DC
  OCRService --> DC
  smarta-saw-proxy --> DC
  smarta-data-source --> DC
  Installer --> DC
  IdolComponent --> DC
