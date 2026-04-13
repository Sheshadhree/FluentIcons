package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PlayCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlayCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(33.766f, 22.713f)
            lineToRelative(-12.362f, -7.388f)
            curveTo(19.904f, 14.43f, 18f, 15.51f, 18f, 17.257f)
            verticalLineToRelative(13.487f)
            curveToRelative(0f, 1.747f, 1.904f, 2.828f, 3.404f, 1.931f)
            lineToRelative(12.362f, -7.387f)
            curveToRelative(0.974f, -0.582f, 0.974f, -1.993f, 0f, -2.575f)
            close()
            moveTo(24f, 44f)
            curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            close()
            moveToRelative(0f, -37.5f)
            curveToRelative(9.665f, 0f, 17.5f, 7.835f, 17.5f, 17.5f)
            reflectiveCurveTo(33.665f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(6.5f, 33.665f, 6.5f, 24f)
            reflectiveCurveTo(14.335f, 6.5f, 24f, 6.5f)
            close()
        }
    }.build()
}
