import Foundation
import SwiftUI

final class AppDelegate: NSObject, UIApplicationDelegate {
    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil
    ) -> Bool {
        
        // Should trigger
        let transition = CATransition()
        transition.type = .push
        transition.subtype = .fromRight
        transition.duration = 0.5

        return true
    }
}