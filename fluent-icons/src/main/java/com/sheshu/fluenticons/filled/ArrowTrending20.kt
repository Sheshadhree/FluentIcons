package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTrending20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrending20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.943f, 5.463f)
            curveToRelative(-0.036f, -0.088f, -0.09f, -0.17f, -0.161f, -0.242f)
            lineTo(17.78f, 5.22f)
            verticalLineTo(5.218f)
            curveTo(17.643f, 5.083f, 17.456f, 5f, 17.25f, 5f)
            horizontalLineToRelative(-5.5f)
            curveTo(11.336f, 5f, 11f, 5.336f, 11f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.69f)
            lineToRelative(-4.94f, 4.94f)
            lineToRelative(-1.97f, -1.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-5.25f, 5.25f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(8f, 11.06f)
            lineToRelative(1.97f, 1.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(5.47f, -5.47f)
            verticalLineToRelative(3.69f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(18f, 11.664f, 18f, 11.25f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.102f, -0.02f, -0.199f, -0.057f, -0.287f)
            close()
        }
    }.build()
}
