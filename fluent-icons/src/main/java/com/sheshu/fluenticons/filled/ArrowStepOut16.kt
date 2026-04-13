package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepOut16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepOut16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.646f, 4.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(7.5f, 2.707f)
            verticalLineTo(9.5f)
            curveTo(7.5f, 9.776f, 7.724f, 10f, 8f, 10f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(2.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-3f, -3f)
            curveTo(8.26f, 1.054f, 8.133f, 1f, 8f, 1f)
            curveTo(7.867f, 1f, 7.74f, 1.053f, 7.646f, 1.147f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            close()
            moveTo(8f, 15f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
