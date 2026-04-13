package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonStar28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStar28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 20.5f)
            curveToRelative(0f, 2.098f, 0.862f, 3.995f, 2.25f, 5.357f)
            curveTo(14.534f, 25.95f, 13.782f, 26f, 13f, 26f)
            curveToRelative(-5.79f, 0f, -10f, -2.567f, -10f, -6.285f)
            verticalLineTo(19f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8.5f)
            curveToRelative(-0.942f, 1.253f, -1.5f, 2.812f, -1.5f, 4.5f)
            close()
            moveTo(13f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(14f, 18.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveTo(14f, 24.09f, 14f, 20.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveToRelative(-5.786f, -3.96f)
            curveToRelative(-0.225f, -0.72f, -1.203f, -0.72f, -1.428f, 0f)
            lineToRelative(-0.716f, 2.298f)
            horizontalLineToRelative(-2.318f)
            curveToRelative(-0.727f, 0f, -1.03f, 0.97f, -0.441f, 1.416f)
            lineToRelative(1.875f, 1.42f)
            lineToRelative(-0.716f, 2.298f)
            curveToRelative(-0.225f, 0.721f, 0.567f, 1.32f, 1.155f, 0.875f)
            lineToRelative(1.875f, -1.42f)
            lineToRelative(1.875f, 1.42f)
            curveToRelative(0.588f, 0.446f, 1.38f, -0.154f, 1.155f, -0.875f)
            lineToRelative(-0.716f, -2.298f)
            lineToRelative(1.875f, -1.42f)
            curveToRelative(0.588f, -0.445f, 0.286f, -1.416f, -0.441f, -1.416f)
            horizontalLineTo(21.93f)
            lineToRelative(-0.716f, -2.297f)
            close()
        }
    }.build()
}
