package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUp12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleUp12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.647f, 5.902f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineTo(5.5f, 4.756f)
            verticalLineTo(8.5f)
            curveTo(5.5f, 8.776f, 5.724f, 9f, 6f, 9f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.756f)
            lineToRelative(1.146f, 1.146f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-2f, -2f)
            curveTo(6.158f, 3f, 5.841f, 3f, 5.646f, 3.195f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            close()
            moveTo(6f, 1f)
            curveTo(3.239f, 1f, 1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveTo(2f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
        }
    }.build()
}
