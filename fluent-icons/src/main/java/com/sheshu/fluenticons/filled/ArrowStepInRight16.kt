package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepInRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepInRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.293f, 8.5f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 8.5f, 1f, 8.276f, 1f, 8f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(6.793f)
            lineTo(6.147f, 5.354f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(3f, 3f)
            curveTo(9.947f, 7.74f, 10f, 7.867f, 10f, 8f)
            curveToRelative(0f, 0.133f, -0.053f, 0.26f, -0.146f, 0.354f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(8.293f, 8.5f)
            close()
            moveTo(15f, 8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            close()
        }
    }.build()
}
