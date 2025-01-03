/*
 * Copyright © 2023, Oracle and/or its affiliates.
 * Released under the Universal Permissive License v1.0 as shown at https://oss.oracle.com/licenses/upl/.
 */

package com.example.benchmarks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * REST Controller which serves as an entry-point for requests for prime number information.
 *
 * @author kris.foster@oracle.com
 */
@SpringBootApplication
public class BenchmarkServerJibber {


    public static void main(String[] args) {
        SpringApplication.run(BenchmarkServerJibber.class, args);
    }
}
