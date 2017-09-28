
#import "RNUmcOpen.h"
#import "UMCSDKOpen/UMCSDKOpen.h"


@implementation RNUmcOpen

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(login:(NSString *)appId appKey:(NSString *)appKey callback:(RCTResponseSenderBlock)callback) {
    dispatch_async(dispatch_get_main_queue(), ^{
        [UMCOpenSDK customInit:appId clientSecret:appKey redirectURL:nil];
        [UMCOpenLogin loginExplicitly:[[UIApplication sharedApplication] keyWindow].rootViewController complete:^(id sender) {
            NSError *error;
            NSData *json = [NSJSONSerialization dataWithJSONObject:sender options:0 error:&error];
            NSString *jsonStr = [[NSString alloc] initWithData:json encoding:NSUTF8StringEncoding];
            callback(@[jsonStr]);
        }];
    });
}

@end
  
