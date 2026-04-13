package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonPill20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonPill20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(2.879f, 9f)
            lineToRelative(-2.94f, 2.94f)
            curveToRelative(-1.09f, 1.09f, -1.34f, 2.705f, -0.748f, 4.035f)
            curveToRelative(-1.544f, -0.098f, -2.962f, -0.481f, -4.056f, -1.178f)
            curveTo(3.833f, 15.967f, 3f, 14.69f, 3f, 13f)
            curveToRelative(0f, -1.113f, 0.903f, -2f, 2.009f, -2f)
            horizontalLineToRelative(7.87f)
            close()
            moveToRelative(5.475f, -0.353f)
            curveToRelative(-1.024f, -1.024f, -2.684f, -1.024f, -3.708f, 0f)
            lineToRelative(-4f, 4f)
            curveToRelative(-1.023f, 1.023f, -1.023f, 2.683f, 0f, 3.707f)
            curveToRelative(1.024f, 1.024f, 2.684f, 1.024f, 3.707f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(1.024f, -1.024f, 1.024f, -2.684f, 0f, -3.707f)
            close()
            moveToRelative(-3f, 0.707f)
            curveToRelative(0.633f, -0.633f, 1.66f, -0.633f, 2.292f, 0f)
            curveToRelative(0.634f, 0.633f, 0.634f, 1.66f, 0f, 2.293f)
            lineTo(16f, 15.293f)
            lineTo(13.707f, 13f)
            lineToRelative(1.646f, -1.646f)
            close()
            moveToRelative(-1.5f, 4.292f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-1f, 1f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(1f, -1f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
