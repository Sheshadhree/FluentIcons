package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.866f, 15.366f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(5.616f, 5.616f)
            horizontalLineTo(15.25f)
            curveTo(14.56f, 22.75f, 14f, 23.31f, 14f, 24f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(14.232f)
            lineToRelative(-5.616f, 5.616f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(7.75f, -7.75f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-7.75f, -7.75f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            close()
            moveTo(24f, 4f)
            curveTo(12.954f, 4f, 4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            close()
            moveTo(6.5f, 24f)
            curveToRelative(0f, -9.665f, 7.835f, -17.5f, 17.5f, -17.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(6.5f, 33.665f, 6.5f, 24f)
            close()
        }
    }.build()
}
