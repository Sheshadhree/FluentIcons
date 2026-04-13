package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pulse28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pulse28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.023f, 3f)
            curveToRelative(0.344f, 0.011f, 0.636f, 0.254f, 0.71f, 0.59f)
            lineToRelative(3.905f, 17.79f)
            lineToRelative(4.148f, -12.86f)
            curveToRelative(0.102f, -0.316f, 0.4f, -0.527f, 0.731f, -0.52f)
            curveToRelative(0.332f, 0.008f, 0.62f, 0.232f, 0.707f, 0.553f)
            lineToRelative(1.349f, 4.947f)
            horizontalLineToRelative(3.677f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(25.664f, 15f, 25.25f, 15f)
            horizontalLineTo(21f)
            curveToRelative(-0.338f, 0f, -0.635f, -0.226f, -0.724f, -0.553f)
            lineTo(19.44f, 11.38f)
            lineToRelative(-4.226f, 13.1f)
            curveToRelative(-0.104f, 0.323f, -0.412f, 0.535f, -0.75f, 0.52f)
            curveToRelative(-0.338f, -0.017f, -0.624f, -0.258f, -0.697f, -0.59f)
            lineTo(9.905f, 6.815f)
            lineTo(7.72f, 14.456f)
            curveTo(7.63f, 14.778f, 7.335f, 15f, 7f, 15f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 15f, 2f, 14.664f, 2f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.684f)
            lineTo(9.28f, 3.544f)
            curveTo(9.373f, 3.214f, 9.68f, 2.99f, 10.023f, 3f)
            close()
        }
    }.build()
}
