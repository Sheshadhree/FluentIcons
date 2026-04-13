package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepInRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepInRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.707f, 19.768f)
            curveToRelative(-0.286f, -0.3f, -0.275f, -0.774f, 0.025f, -1.06f)
            lineToRelative(4.146f, -3.958f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14.75f, 2f, 14.414f, 2f, 14f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(11.128f)
            lineTo(9.732f, 9.293f)
            curveToRelative(-0.3f, -0.286f, -0.31f, -0.761f, -0.024f, -1.06f)
            curveToRelative(0.285f, -0.3f, 0.76f, -0.312f, 1.06f, -0.026f)
            lineToRelative(5.5f, 5.25f)
            curveTo(16.416f, 13.6f, 16.5f, 13.795f, 16.5f, 14f)
            curveToRelative(0f, 0.205f, -0.084f, 0.401f, -0.232f, 0.543f)
            lineToRelative(-5.5f, 5.25f)
            curveToRelative(-0.3f, 0.285f, -0.775f, 0.274f, -1.06f, -0.025f)
            close()
            moveTo(26f, 14f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            close()
        }
    }.build()
}
