from JDI.core.settings.timeout_settings import TimeoutSettings


class JDISettings(object):

    timeouts = TimeoutSettings()
    _driver_factory = None
    __logger = None

    @staticmethod
    def get_driver_factory():
        return JDISettings._driver_factory

    # @staticmethod
    # def get_logger(name="JDI"):
    #     if JDISettings.__logger:
    #         return JDISettings.__logger
    #     else:
    #         return JDISettings.set_logger(name)
    #
    # @staticmethod
    # def set_logger(name):
    #     logger =
    #     logger.setLevel(logging.INFO)
    #     logger.setLevel(logging.DEBUG)
    #     hdlr = logging.FileHandler('jdi.log')
    #     hdlr.setFormatter(logging.Formatter('%(asctime)s %(levelname)s %(message)s'))
    #     logger.addHandler(hdlr)
    #     JDISettings.__logger = logger
    #     return JDISettings.__logger




