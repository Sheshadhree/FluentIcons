package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SwipeUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 18.003f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.647f)
            lineToRelative(0.007f, -0.102f)
            verticalLineTo(4.56f)
            lineToRelative(2.22f, 2.216f)
            curveToRelative(0.266f, 0.266f, 0.683f, 0.29f, 0.976f, 0.073f)
            lineToRelative(0.084f, -0.073f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.682f, 0.073f, -0.975f)
            lineTo(16.03f, 5.716f)
            lineToRelative(-3.5f, -3.497f)
            curveToRelative(-0.266f, -0.266f, -0.683f, -0.29f, -0.976f, -0.072f)
            lineTo(11.47f, 2.22f)
            lineToRelative(-3.5f, 3.496f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.266f, 0.266f, 0.683f, 0.29f, 0.976f, 0.073f)
            lineTo(9.03f, 6.776f)
            lineToRelative(2.22f, -2.216f)
            verticalLineToRelative(12.694f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveTo(12f, 22f)
            curveToRelative(2.761f, 0f, 5f, -2.237f, 5f, -4.996f)
            curveToRelative(0f, -2.143f, -1.351f, -3.972f, -3.25f, -4.68f)
            verticalLineToRelative(1.651f)
            curveToRelative(1.046f, 0.605f, 1.75f, 1.735f, 1.75f, 3.03f)
            curveToRelative(0f, 1.93f, -1.567f, 3.496f, -3.5f, 3.496f)
            reflectiveCurveToRelative(-3.5f, -1.565f, -3.5f, -3.497f)
            curveToRelative(0f, -1.294f, 0.704f, -2.425f, 1.75f, -3.03f)
            verticalLineToRelative(-1.651f)
            curveTo(8.352f, 13.032f, 7f, 14.86f, 7f, 17.004f)
            curveTo(7f, 19.764f, 9.239f, 22f, 12f, 22f)
            close()
        }
    }.build()
}
