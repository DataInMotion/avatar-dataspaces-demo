# AVATAR Dataspace Demo

In this project you will find the setup for a the avatar query backend, which is responsible of forwarding the query to a process orchestrator (developed by Navimatix), which, in turns assigns the query task in the dataspace, where different connectors, each one associated with its corresponding data provider, will communicate it to the data provider.

A plantUML diagram of a query request can be found [here](.documentation/plantUML/AvatarConnectorSystem.puml), while the bpmn diagram used in the orchestrator can be found [here](./documentation/bpmn/dim_query_single_provider.bpmn) (or in [png](./documentation/bpmn/dim_query_single_provider.png)).
