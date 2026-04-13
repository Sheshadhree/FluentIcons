package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepInRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepInRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3.793f)
            lineTo(4.146f, 4.354f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(5.293f, 6.5f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 6.5f, 1f, 6.276f, 1f, 6f)
            close()
            moveToRelative(8.5f, -1.5f)
            curveTo(10.328f, 4.5f, 11f, 5.172f, 11f, 6f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(8f, 6.828f, 8f, 6f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(9.224f, 5.5f, 9f, 5.724f, 9f, 6f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(10f, 6.276f, 10f, 6f)
            reflectiveCurveTo(9.776f, 5.5f, 9.5f, 5.5f)
            close()
        }
    }.build()
}
