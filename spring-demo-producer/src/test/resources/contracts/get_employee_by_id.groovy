package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return employee by id=1"

    request {
        url "/employees/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: "1",
                name: "foo"
        )
    }
}