package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-4.646f, 0.854f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10.5f, 12.293f)
            verticalLineTo(6.5f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineToRelative(5.793f)
            lineToRelative(-2.146f, -2.147f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(3f, 3f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            close()
        }
    }.build()
}
