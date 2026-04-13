package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepIn12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepIn12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3.793f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(5.5f, 5.293f)
            verticalLineTo(1.5f)
            curveTo(5.5f, 1.224f, 5.724f, 1f, 6f, 1f)
            close()
            moveToRelative(1.5f, 8.5f)
            curveTo(7.5f, 10.328f, 6.828f, 11f, 6f, 11f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(5.172f, 8f, 6f, 8f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(6.5f, 9.224f, 6.276f, 9f, 6f, 9f)
            reflectiveCurveTo(5.5f, 9.224f, 5.5f, 9.5f)
            reflectiveCurveTo(5.724f, 10f, 6f, 10f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
