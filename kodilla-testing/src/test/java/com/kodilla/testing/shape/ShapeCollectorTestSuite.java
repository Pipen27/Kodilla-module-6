package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.Collections;
import java.util.List;

public class ShapeCollectorTestSuite {


        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @Nested
        @DisplayName("Adding and removing tests")
        class AddAndRemoveTest {

            @Test
            void testAddFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();

                //When
                shapeCollector.addFigure(new Square("Square", 7));

                //Then
                Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
            }

            @Test
            void testRemoveFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();

                shapeCollector.addFigure(new Square("Square", 7));

                //When
                boolean result = shapeCollector.removeFigure(shapeCollector);

                //Then
                Assertions.assertTrue(result);
                Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
            }


        }


        @Nested
        @DisplayName("Rest of tests")
        class RestTest {

            @Test
            void testGetFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();
               Circle shape = new Circle("Circle", 9);

                shapeCollector.addFigure(shape);

                //When
                String retrievedPost;
                retrievedPost = shapeCollector.getFigure(0);

                //Then
                Assertions.assertEquals(shape.getShapeName("Circle"), retrievedPost);
            }

            @Test
            void testShowFigures() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle shape = new Circle("Circle", 9);
                shapeCollector.addFigure(new Circle("Circle", 9));

                shapeCollector.showFigures();

                //When
                List<String> retrievedPost;
                retrievedPost = Collections.singletonList("Circle");

                //Then
                Assertions.assertEquals(shapeCollector.showFigures(), retrievedPost);
            }
        }
    }
