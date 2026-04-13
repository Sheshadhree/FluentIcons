package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTrendingDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrendingDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.943f, 14.537f)
            curveToRelative(-0.036f, 0.088f, -0.09f, 0.17f, -0.161f, 0.242f)
            lineTo(17.78f, 14.78f)
            lineToRelative(-0.001f, 0.002f)
            curveTo(17.643f, 14.917f, 17.456f, 15f, 17.25f, 15f)
            horizontalLineToRelative(-5.5f)
            curveTo(11.336f, 15f, 11f, 14.664f, 11f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.69f)
            lineTo(10.5f, 8.56f)
            lineToRelative(-1.97f, 1.97f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(2.22f, 5.28f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(8f, 8.94f)
            lineToRelative(1.97f, -1.97f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(5.47f, 5.47f)
            verticalLineTo(8.75f)
            curveTo(16.5f, 8.336f, 16.836f, 8f, 17.25f, 8f)
            reflectiveCurveTo(18f, 8.336f, 18f, 8.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.102f, -0.02f, 0.199f, -0.057f, 0.287f)
            close()
        }
    }.build()
}
