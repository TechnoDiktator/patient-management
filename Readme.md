https://editor.swagger.io/   ==> this is an editor that is used to document springboot apis that you created in your app 





![img.png](project-images/img.png)




My recommendation

Yes, add one MongoDB-backed microservice, but give it a real purpose.

An Audit Service (or enhanced Analytics Service) that consumes Kafka events 
and stores flexible event documents in MongoDB is a strong design choice. 
It lets you explain why you chose a document database instead of PostgreSQL, which is exactly 
the kind of architectural reasoning senior interviewers look for.


If I had to choose between adding MongoDB and adding observability/testing, I'd do this:

✅ JWT Authentication & Authorization
✅ API Gateway security
✅ Flyway migrations
✅ Micrometer + Prometheus + Grafana
✅ OpenTelemetry tracing
✅ Testcontainers integration tests
✅ Redis caching
MongoDB Audit/Analytics Service
Kubernetes deployment

I would not move MongoDB ahead of observability or testing.


