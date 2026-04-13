package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronCircleRight48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronCircleRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 41.5f)
            curveToRelative(-9.665f, 0f, -17.5f, -7.835f, -17.5f, -17.5f)
            reflectiveCurveTo(14.335f, 6.5f, 24f, 6.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 41.5f, 24f, 41.5f)
            close()
            moveTo(4f, 24f)
            curveToRelative(0f, 11.046f, 8.954f, 20f, 20f, 20f)
            reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            close()
            moveToRelative(16.366f, 8.616f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(9.5f, -9.5f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-9.5f, -9.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(28.982f, 24f)
            lineToRelative(-8.616f, 8.616f)
            close()
        }
    }.build()
}
