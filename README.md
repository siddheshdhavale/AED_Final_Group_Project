# AED_Final_Group_Project
AED Final group project


Emergency Management Systems


Emergency Management Systems provide solutions to incidents occuring in any part of a community. Emergency Management protects communities by coordinating and integrating all activities necessary to build, sustain, and improve the capability to mitigate against, prepare for, respond to, and recover from threatened or actual natural disasters, acts of terrorism, or other man-made disasters.
An emergency is often complex and unpredictable, make it incredibly difficult for organizations if they don’t have adequate arrangements in place. Our management system provides solutions to these situations. 



Object diagram model diagram:

![obj_diag_emergency_mngmt](https://user-images.githubusercontent.com/113790377/206954640-f7bf6fa1-2b3d-450f-80b2-35f615892618.jpg)

[Object_diagram.pdf](https://github.com/siddheshdhavale/AED_Final_Group_Project/files/10204360/Object_diagram.pdf)

Class Diagram:

![Class_diag_emergency_mngmt](https://user-images.githubusercontent.com/113790377/206954743-9751d068-dc33-4ea3-a859-10b4298edea0.jpeg)

[Emergency Management (2).pdf](https://github.com/siddheshdhavale/AED_Final_Group_Project/files/10204359/Emergency.Management.2.pdf)


Explaination:

Our Emergency management system allows us to create multiple Networks, where there are a total number of eight Organizations; Civil Society Organization, Cops Organization, Doctor Organization, Event Creator Organization, Fire Fighter organization, Supplier, Victim and Volunteer Organization, and consists of six enterprises; Civil Society Organization, Community, Cops, Fire Fighter, Hospital and Supplier, and has nine roles; Civil Society Role, Cops Role, Doctor Role, Event Creator Role, Fire Fighter Role, Supplier Role, Victim Role, and Volunteer Role.

First, the System admin logs in, manages (Creates) Network, Enterprises and Enterprise Admin where the admin creates admins for each enterprise. Manager enterprise admin then logs in as an enterprise admin for his particular enterprise type. Manager enterprise admin then manages organization, employee, and user credentials. After user credentials are created, Community enterprise then creates Event creator, volunteer, and victim admins. Then the admins create victim admin, the event seeker creates a Request Help which is then assigned to the appropriate Relay request (CSO, Cops, Health Dept, Fire Dept) by the event maker. The request then goes to appropriate Work Area (CSO, Cops, Health Dept, Fire Dept), where each role can then acknowledge the incident. Once the incident is acknowledged, the acknowledged status is then updated in every table of the Event Seeker Work Area and Event Maker Work Area as Acknowledged. Then once the incident is resolved, the roles(CSO, Cops, Doctor, Firefighter) then changes the status from acknowledged to responded.
This status is updated and populated in every WorkArea table as Resolved.
The entire flow repeats for each and every enterprise, organization, employees and their different roles and is ultimately resolved.

For example, if the event seeker request a cops related request help, the event creator will then assign it to the cops WorkArea. Once it’s assigned to the cops work area, the cops employee created before will be able to see the reques help requested by the event seeker. Any cop will then acknowledge the incident  to himself. After acknowledgement, the status of the incident will then be updated in Event Seeker table and event maker table. A cop then resolves the incident and updates the incident status from acknowledged to resolved. Hence this will be reflected in every work area and the incident will be resolved.
