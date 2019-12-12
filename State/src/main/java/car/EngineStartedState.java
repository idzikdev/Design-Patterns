package car;

import static car.Info.HAVE_TO_STOP_ENGINE;
import static car.Info.HAVE_TO_START_DRIVING;
import static car.Info.JUST_STOPPED_ENGINE;
import static car.Info.JUST_START_DRIVING;
import static car.Info.ALREADY_UNLOCKED;
import static car.Info.ALREADY_STARTED_ENGINE;

public class EngineStartedState extends BaseLogger implements State {

    @Override
    public void startEngine(Car car) {
        logger.info(ALREADY_STARTED_ENGINE.getDescription());
    }

    @Override
    public void stopEngine(Car car) {
        logger.info(JUST_STOPPED_ENGINE.getDescription());
        car.state = new EngineNotStartedState();
    }

    @Override
    public void open(Car car) {
        logger.info(ALREADY_UNLOCKED.getDescription());
    }

    @Override
    public void close(Car car) {
        logger.info(HAVE_TO_STOP_ENGINE.getDescription());
    }

    @Override
    public void startDriving(Car car) {
        logger.info(JUST_START_DRIVING.getDescription());
        car.state = new StartedDrivingState();
    }

    @Override
    public void stopDriving(Car car) {
        logger.info(HAVE_TO_START_DRIVING.getDescription());
    }
}