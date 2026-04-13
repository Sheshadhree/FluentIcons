package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSort16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSort16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.73f, 13.79f)
            curveToRelative(0.29f, 0.28f, 0.75f, 0.28f, 1.04f, 0f)
            lineToRelative(2.75f, -2.65f)
            curveToRelative(0.299f, -0.288f, 0.308f, -0.762f, 0.02f, -1.06f)
            curveToRelative(-0.287f, -0.299f, -0.762f, -0.308f, -1.06f, -0.02f)
            lineTo(12f, 11.486f)
            verticalLineTo(2.75f)
            curveTo(12f, 2.336f, 11.664f, 2f, 11.25f, 2f)
            reflectiveCurveTo(10.5f, 2.336f, 10.5f, 2.75f)
            verticalLineToRelative(8.736f)
            lineTo(9.02f, 10.06f)
            curveToRelative(-0.298f, -0.288f, -0.773f, -0.28f, -1.06f, 0.02f)
            curveToRelative(-0.287f, 0.298f, -0.279f, 0.772f, 0.02f, 1.06f)
            lineToRelative(2.75f, 2.65f)
            close()
            moveTo(5.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(1.47f, 4.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(4f, 4.56f)
            verticalLineToRelative(8.69f)
            curveTo(4f, 13.664f, 4.336f, 14f, 4.75f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineToRelative(1.47f, 1.47f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(5.28f, 2.22f)
            close()
        }
    }.build()
}
