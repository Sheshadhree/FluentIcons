package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PauseCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PauseCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 16.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(18f, 31.94f, 18f, 31.25f)
            verticalLineToRelative(-14.5f)
            close()
            moveToRelative(10.75f, -1.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(30f, 31.94f, 30f, 31.25f)
            verticalLineToRelative(-14.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            close()
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            reflectiveCurveTo(14.335f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(41.5f, 33.665f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 6.5f, 24f, 6.5f)
            close()
        }
    }.build()
}
