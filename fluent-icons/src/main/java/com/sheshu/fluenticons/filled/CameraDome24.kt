package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CameraDome24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraDome24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(16.5f)
            curveTo(21.216f, 2f, 22f, 2.784f, 22f, 3.75f)
            reflectiveCurveTo(21.216f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 5.5f, 2f, 4.716f, 2f, 3.75f)
            close()
            moveTo(12f, 17.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(2.5f, -4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveTo(10.62f, 11f, 12f, 11f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(3f, 7f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            verticalLineTo(7f)
            close()
            moveToRelative(9f, 12f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(15.038f, 8f, 12f, 8f)
            reflectiveCurveToRelative(-5.5f, 2.462f, -5.5f, 5.5f)
            reflectiveCurveTo(8.962f, 19f, 12f, 19f)
            close()
        }
    }.build()
}
