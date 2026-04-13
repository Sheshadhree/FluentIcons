package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 11f)
            curveToRelative(1.33f, 0f, 2.55f, -0.472f, 3.5f, -1.257f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineTo(7.373f)
            lineToRelative(7.747f, 4.558f)
            curveToRelative(0.156f, 0.092f, 0.35f, 0.092f, 0.507f, 0f)
            lineToRelative(2.23f, -1.312f)
            curveTo(13.108f, 10.865f, 13.788f, 11f, 14.5f, 11f)
            close()
            moveToRelative(-10f, -7f)
            horizontalLineToRelative(4.707f)
            curveTo(9.072f, 4.477f, 9f, 4.98f, 9f, 5.5f)
            curveToRelative(0f, 1.906f, 0.97f, 3.585f, 2.442f, 4.572f)
            lineTo(10f, 10.92f)
            lineTo(2.015f, 6.223f)
            curveTo(2.153f, 4.973f, 3.213f, 4f, 4.5f, 4f)
            close()
            moveToRelative(10f, 6f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 1f, 14.5f, 1f)
            reflectiveCurveTo(10f, 3.015f, 10f, 5.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
            moveToRelative(2.354f, -5.646f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(13.5f, 6.293f)
            lineToRelative(2.646f, -2.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
