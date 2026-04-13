package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBucket24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBucket24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(10.5f, 1.836f, 10.5f, 2.25f)
            verticalLineTo(3.5f)
            curveToRelative(-0.307f, 0.108f, -0.595f, 0.285f, -0.841f, 0.53f)
            lineTo(2.78f, 10.91f)
            curveToRelative(-0.878f, 0.879f, -0.878f, 2.303f, 0f, 3.182f)
            lineToRelative(4.88f, 4.878f)
            curveToRelative(0.879f, 0.878f, 2.303f, 0.878f, 3.182f, 0f)
            lineToRelative(6.879f, -6.879f)
            curveToRelative(0.878f, -0.879f, 0.878f, -2.303f, 0f, -3.182f)
            lineTo(12.84f, 4.03f)
            curveTo(12.595f, 3.785f, 12.307f, 3.608f, 12f, 3.5f)
            verticalLineTo(2.25f)
            close()
            moveToRelative(-1.5f, 3.06f)
            verticalLineToRelative(1.44f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(12f, 7.164f, 12f, 6.75f)
            verticalLineTo(5.31f)
            lineToRelative(4.659f, 4.66f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            lineTo(15.689f, 12f)
            horizontalLineTo(3.812f)
            lineToRelative(0.029f, -0.03f)
            lineTo(10.5f, 5.31f)
            close()
            moveToRelative(9.021f, 8.292f)
            curveToRelative(-0.329f, -0.617f, -1.213f, -0.617f, -1.542f, 0f)
            lineToRelative(-2.008f, 3.766f)
            curveTo(14.85f, 19.466f, 16.372f, 22f, 18.75f, 22f)
            reflectiveCurveToRelative(3.898f, -2.534f, 2.78f, -4.632f)
            lineToRelative(-2.009f, -3.766f)
            close()
        }
    }.build()
}
