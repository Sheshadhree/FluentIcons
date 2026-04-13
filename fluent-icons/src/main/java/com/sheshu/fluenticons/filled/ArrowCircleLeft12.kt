package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(3.239f, 1f, 1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveTo(5.902f, 3.647f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            lineTo(4.756f, 5.5f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 5.5f, 9f, 5.724f, 9f, 6f)
            reflectiveCurveTo(8.776f, 6.5f, 8.5f, 6.5f)
            horizontalLineTo(4.756f)
            lineToRelative(1.146f, 1.146f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveTo(3f, 6.158f, 3f, 5.841f, 3.195f, 5.646f)
            lineToRelative(2f, -2f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
