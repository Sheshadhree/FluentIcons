package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckmarkCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
            moveToRelative(8.634f, 13.616f)
            curveToRelative(-0.456f, -0.456f, -1.175f, -0.486f, -1.666f, -0.091f)
            lineToRelative(-0.102f, 0.091f)
            lineTo(20.75f, 27.732f)
            lineToRelative(-3.616f, -3.616f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            curveToRelative(-0.455f, 0.456f, -0.486f, 1.175f, -0.091f, 1.666f)
            lineToRelative(0.091f, 0.102f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.456f, 0.456f, 1.176f, 0.486f, 1.666f, 0.091f)
            lineToRelative(0.102f, -0.091f)
            lineToRelative(11f, -11f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            close()
        }
    }.build()
}
