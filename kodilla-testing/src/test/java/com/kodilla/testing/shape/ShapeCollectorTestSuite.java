package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

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
                Circle shape = new Circle("Circle", 9);
                shapeCollector.addFigure(shape);


                //When
               shapeCollector.removeFigure(shape);

                //Then

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
                Shape retrievedPost;
                retrievedPost = shapeCollector.getFigure(0);

                //Then
                Assertions.assertEquals(shape, retrievedPost);
            }



            }

            @Test
            void testShowFigures() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle shape = new Circle("Circle", 9);
                shapeCollector.addFigure(new Circle("Circle", 9));




                //When
                Shape retrievedShape;
                retrievedShape = shapeCollector.showFigures().get(0);


                //Then


                Assertions.assertNotEquals(retrievedShape, shape);


            }
        }

