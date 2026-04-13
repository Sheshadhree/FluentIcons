package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CameraDome28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraDome28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.75f)
            curveTo(2f, 3.784f, 2.784f, 3f, 3.75f, 3f)
            horizontalLineToRelative(20.5f)
            curveTo(25.216f, 3f, 26f, 3.784f, 26f, 4.75f)
            reflectiveCurveTo(25.216f, 6.5f, 24.25f, 6.5f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 6.5f, 2f, 5.716f, 2f, 4.75f)
            close()
            moveTo(9f, 16.5f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, 3.5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(15.933f, 13f, 14f, 13f)
            reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveTo(12.067f, 20f, 14f, 20f)
            close()
            moveTo(3f, 8f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(3f, 21.075f, 3f, 15f)
            verticalLineTo(8f)
            close()
            moveToRelative(4.5f, 8.5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(17.59f, 10f, 14f, 10f)
            reflectiveCurveToRelative(-6.5f, 2.91f, -6.5f, 6.5f)
            close()
        }
    }.build()
}
