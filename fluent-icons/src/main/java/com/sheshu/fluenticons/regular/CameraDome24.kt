package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CameraDome24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CameraDome24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(13.38f, 11f, 12f, 11f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveTo(10.62f, 16f, 12f, 16f)
            close()
            moveToRelative(0f, -8f)
            curveToRelative(-3.038f, 0f, -5.5f, 2.462f, -5.5f, 5.5f)
            reflectiveCurveTo(8.962f, 19f, 12f, 19f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(15.038f, 8f, 12f, 8f)
            close()
            moveToRelative(-4f, 5.5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(16.5f)
            curveTo(21.216f, 2f, 22f, 2.784f, 22f, 3.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.698f, -0.409f, 1.3f, -1f, 1.582f)
            verticalLineTo(13f)
            curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            verticalLineTo(6.832f)
            curveTo(2.409f, 6.55f, 2f, 5.948f, 2f, 5.25f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(4.5f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(3.75f, 3.5f)
            curveTo(3.612f, 3.5f, 3.5f, 3.612f, 3.5f, 3.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
