package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepInLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepInLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(6.707f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(6.707f, 6.5f)
            horizontalLineTo(10.5f)
            curveTo(10.776f, 6.5f, 11f, 6.276f, 11f, 6f)
            close()
            moveTo(2.5f, 4.5f)
            curveTo(1.672f, 4.5f, 1f, 5.172f, 1f, 6f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveTo(4f, 6.828f, 4f, 6f)
            reflectiveCurveTo(3.328f, 4.5f, 2.5f, 4.5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(2.776f, 5.5f, 3f, 5.724f, 3f, 6f)
            reflectiveCurveTo(2.776f, 6.5f, 2.5f, 6.5f)
            reflectiveCurveTo(2f, 6.276f, 2f, 6f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
