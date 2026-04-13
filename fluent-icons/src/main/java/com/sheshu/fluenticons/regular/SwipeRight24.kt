package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SwipeRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.997f, 12f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.647f, 0.743f)
            lineToRelative(0.102f, 0.007f)
            horizontalLineTo(19.44f)
            lineToRelative(-2.216f, 2.22f)
            curveToRelative(-0.266f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineToRelative(0.073f, 0.084f)
            curveToRelative(0.266f, 0.267f, 0.682f, 0.29f, 0.975f, 0.073f)
            lineToRelative(0.084f, -0.073f)
            lineToRelative(3.497f, -3.5f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.683f, 0.073f, -0.976f)
            lineTo(21.78f, 11.47f)
            lineToRelative(-3.497f, -3.5f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.265f, 0.266f, -0.29f, 0.683f, -0.072f, 0.976f)
            lineToRelative(0.073f, 0.084f)
            lineToRelative(2.216f, 2.22f)
            horizontalLineTo(6.746f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            close()
            moveTo(2f, 12f)
            curveToRelative(0f, 2.761f, 2.237f, 5f, 4.996f, 5f)
            curveToRelative(2.143f, 0f, 3.972f, -1.351f, 4.68f, -3.25f)
            horizontalLineToRelative(-1.651f)
            curveTo(9.42f, 14.797f, 8.29f, 15.5f, 6.995f, 15.5f)
            curveTo(5.066f, 15.5f, 3.5f, 13.933f, 3.5f, 12f)
            reflectiveCurveToRelative(1.565f, -3.5f, 3.497f, -3.5f)
            curveToRelative(1.294f, 0f, 2.425f, 0.704f, 3.03f, 1.75f)
            horizontalLineToRelative(1.651f)
            curveTo(10.968f, 8.352f, 9.14f, 7f, 6.996f, 7f)
            curveTo(4.236f, 7f, 2f, 9.239f, 2f, 12f)
            close()
        }
    }.build()
}
