package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonPill20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonPill20",
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
            moveTo(7f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(5.879f, 5f)
            horizontalLineToRelative(-7.87f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveToRelative(1.094f, 0.697f, 2.512f, 1.08f, 4.056f, 1.178f)
            curveToRelative(-0.146f, -0.329f, -0.24f, -0.675f, -0.285f, -1.026f)
            curveToRelative(-1.278f, -0.121f, -2.394f, -0.46f, -3.233f, -0.996f)
            curveTo(4.623f, 15.283f, 4f, 14.31f, 4f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineToRelative(6.87f)
            lineToRelative(1f, -1f)
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
